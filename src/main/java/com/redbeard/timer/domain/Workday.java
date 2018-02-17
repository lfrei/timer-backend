package com.redbeard.timer.domain;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class Workday {
    private String user;
    private List<Worklog> worklogs;

    public Workday() {
    }

    public Workday(String user, List<Worklog> worklogs) {
        this.user = user;
        this.worklogs = worklogs;
    }

    public static Workday create(String user, Worklog... worklogs) {
        return new Workday(user, asList(worklogs));
    }

    public String getUser() {
        return user;
    }

    public List<Worklog> getWorklogs() {
        return worklogs;
    }
}
