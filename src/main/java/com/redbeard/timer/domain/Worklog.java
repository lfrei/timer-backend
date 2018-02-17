package com.redbeard.timer.domain;

import javax.persistence.*;

@Entity
@Table(name = "worklog")
public class Worklog {
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user")
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
