package com.redbeard.timer;

import com.redbeard.timer.domain.Workday;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimerController {

    @GetMapping("/workdays")
    public List<Workday> getWorkdays() {
        return WorkdayRepository.findAll();
    }

    @GetMapping("/workdays/{user}")
    public List<Workday> getWorkdaysByUser(@PathVariable("user") String user) {
        return WorkdayRepository.findByUser(user);
    }

    @PostMapping("/workday")
    @ResponseStatus(HttpStatus.CREATED)
    public void addWorkday(@RequestBody() Workday workday) {
        WorkdayRepository.create(workday);
    }
}

