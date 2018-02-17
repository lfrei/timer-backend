package com.redbeard.timer;

import com.redbeard.timer.domain.Workday;
import com.redbeard.timer.domain.Worklog;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.*;

public class WorkdayRepository {

    private static List<Workday> workdays = new ArrayList<>();

    static {
        workdays.add(Workday.create("redbeard",
                Worklog.create("C1000", 30),
                Worklog.create("C2500", 120),
                Worklog.create("C9999", 150)
        ));
    }

    static List<Workday> findAll() {
        return workdays;
    }

    static void create(Workday workday) {
        workdays.add(workday);
    }

    static List<Workday> findByUser(String user) {
        return workdays.stream()
                .filter(workday -> workday.getUser().equals(user))
                .collect(toList());
    }

}
