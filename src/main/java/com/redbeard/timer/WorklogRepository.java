package com.redbeard.timer;

import com.redbeard.timer.domain.Worklog;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class WorklogRepository {

    private static List<Worklog> worklogs = new ArrayList<>();

    static {
        worklogs.add(Worklog.create("redbeard", "C1000", 1, 30));
        worklogs.add(Worklog.create("paul", "C1000", 1, 60));
        worklogs.add(Worklog.create("manuel", "C2500", 1, 120));
    }

    static List<Worklog> findAll() {
        return worklogs;
    }

    static void create(Worklog worklog) {
        worklogs.add(worklog);
    }

    static List<Worklog> findByUser(String user) {
        return worklogs.stream()
                .filter(worklog -> worklog.getUser().equals(user))
                .collect(toList());
    }

    static List<Worklog> findByProject(String project) {
        return worklogs.stream()
                .filter(worklog -> worklog.getProject().equals(project))
                .collect(toList());
    }

}
