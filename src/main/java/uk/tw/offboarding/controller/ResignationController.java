package uk.tw.offboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.tw.offboarding.request.AcceptResignationRequest;
import uk.tw.offboarding.request.WorkingDayUpdateRequest;
import uk.tw.offboarding.services.DataService;

@RestController
@RequestMapping("/resignation")
@CrossOrigin(origins = "*")
public class ResignationController {

    @Autowired
    DataService dataService;


    @GetMapping("/data")
    public ResponseEntity getData(){
        return ResponseEntity.ok(dataService.getEmployees());
    }

    @GetMapping("")
    public ResponseEntity getResignation() {
        return ResponseEntity.ok(dataService.getTerminations());
    }

    @PutMapping("/{terminationId}")
    public ResponseEntity updateResignation(@RequestBody WorkingDayUpdateRequest workingDayUpdateRequest, @PathVariable() int terminationId) throws Exception {
        dataService.updateTermination(terminationId, workingDayUpdateRequest);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @PutMapping("/{terminationId}/accept")
    public ResponseEntity acceptResignation(@RequestBody AcceptResignationRequest acceptResignationRequest, @PathVariable() int terminationId) throws Exception {
        dataService.acceptTermination(terminationId, acceptResignationRequest);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{terminationId}/{checkListItem}")
    public ResponseEntity checkOffCheckListItem(@PathVariable() int terminationId, @PathVariable() String checkListItem) throws Exception {
        dataService.checkOffCheckListItem(terminationId, checkListItem);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
