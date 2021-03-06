package com.redbeard.timer.domain;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "worklog")
public class Worklog {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "username")
    private String user;

    @Column(name = "project")
    private String project;

    @Column(name = "day")
    private int day;

    @Column(name = "time")
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

    public long getId() {
        return id;
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

    public Worklog createWorklogWithCurrentDay() {
        return new Worklog(user, project, getCurrentJulianDate(), time);
    }

    private int getCurrentJulianDate() {
        return Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
    }

    @Override
    public String toString() {
        return "Worklog{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", project='" + project + '\'' +
                ", day=" + day +
                ", time=" + time +
                '}';
    }
}
