package uk.tw.offboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.tw.offboarding.SeedingApplicationDataConfiguration;
import uk.tw.offboarding.domain.Employee;

import java.util.List;

@RestController
@RequestMapping("/")
public class PingPongController {

    @Autowired
    SeedingApplicationDataConfiguration seedingApplicationDataConfiguration;
    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("/ping")
    public ResponseEntity ping(@RequestBody String message) {
        return ResponseEntity.ok(message);
    }

    @CrossOrigin(origins = "http://localhost:8081")
    @GetMapping("/data")
    public ResponseEntity getData() throws Exception {
        return ResponseEntity.ok(seedingApplicationDataConfiguration.getEmployees());
    }
}
