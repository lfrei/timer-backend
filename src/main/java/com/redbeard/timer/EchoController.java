package com.redbeard.timer;

import com.redbeard.timer.domain.ServerStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @CrossOrigin
    @GetMapping("/echo")
    public ServerStatus getEcho() {
        return ServerStatus.create("Timer Backend running");
    }
}
