package com.redbeard.timer.domain;

public class Worklog {
    private String user;
    private String project;
    private int day;
    private int time;

    public Worklog() {
    }

    public Worklog(String user, String project, int day, int time) {
        this.user = user;
        this.project = project;
        this.day = day;
        this.time = time;
    }

    public static Worklog create(String user, String project, int day, int time) {
        return new Worklog(user, project, day, time);
    }

    public String getUser() {
        return user;
    }

    public String getProject() {
        return project;
    }

    public int getDay() {
        return day;
    }

    public int getTime() {
        return time;
    }
}
