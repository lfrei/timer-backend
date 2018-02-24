package com.redbeard.timer;

import com.redbeard.timer.domain.ServerStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @CrossOrigin
    @GetMapping("/echo")
    public ServerStatus getEcho() {
        log.info("echo method called");
        return ServerStatus.create("Timer Backend running");
    }
}
