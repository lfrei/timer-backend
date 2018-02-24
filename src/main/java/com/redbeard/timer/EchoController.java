package com.redbeard.timer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo")
    public String getEcho() {
        return "Timer backend running";
    }
}
