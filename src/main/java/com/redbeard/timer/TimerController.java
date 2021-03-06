package com.redbeard.timer;

import com.redbeard.timer.domain.Worklog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.*;

@RestController
public class TimerController {

    private final WorklogRepository repository;

    @Autowired
    public TimerController(WorklogRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin
    @GetMapping("/worklogs")
    public List<Worklog> getWorklogs() {
        return StreamSupport
                .stream(repository.findAll().spliterator(), false)
                .collect(toList());
    }

    @CrossOrigin
    @GetMapping("/worklogs/{user}")
    public List<Worklog> getWorklogsByUser(@PathVariable("user") String user) {
        return repository.findByUser(user);
    }

    @CrossOrigin
    @PostMapping("/worklog")
    @ResponseStatus(HttpStatus.CREATED)
    public long addWorklog(@RequestBody() Worklog worklog) {
        return repository.save(worklog.createWorklogWithCurrentDay()).getId();
    }
}

