package uk.tw.offboarding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.tw.offboarding.SeedingApplicationDataConfiguration;

@RestController
@RequestMapping("/")
public class PingPongController {

    @PostMapping("/ping")
    public ResponseEntity ping(@RequestBody String message) {
        return ResponseEntity.ok(message);
    }
}
