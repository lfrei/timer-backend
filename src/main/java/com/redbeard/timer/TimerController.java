package com.redbeard.timer;

import com.redbeard.timer.domain.Worklog;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimerController {

    @GetMapping("/worklogs")
    public List<Worklog> getWorklogs() {
        return WorklogRepository.findAll();
    }

    @GetMapping("/worklogs/{user}")
    public List<Worklog> getWorklogsByUser(@PathVariable("user") String user) {
        return WorklogRepository.findByUser(user);
    }

    @PostMapping("/worklog")
    @ResponseStatus(HttpStatus.CREATED)
    public void addWorklog(@RequestBody() Worklog worklog) {
        WorklogRepository.create(worklog);
    }
}

