package com.redbeard.timer.domain;

public class Worklog {
    private String project;
    private int time;

    public Worklog() {
    }

    public Worklog(String project, int time) {
        this.project = project;
        this.time = time;
    }

    public static Worklog create(String project, int time) {
        return new Worklog(project, time);
    }

    public String getProject() {
        return project;
    }

    public int getTime() {
        return time;
    }
}
