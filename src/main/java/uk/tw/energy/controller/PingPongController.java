package uk.tw.energy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PingPongController {
    @CrossOrigin(origins = "http://localhost:8081")
    @PostMapping("/ping")
    public ResponseEntity ping(@RequestBody String message) {
        return ResponseEntity.ok(message);
    }
}
