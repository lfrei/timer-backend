package com.redbeard.timer;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @CrossOrigin
    @GetMapping("/echo")
    public String getEcho() {
        return "Timer backend running";
    }
}
