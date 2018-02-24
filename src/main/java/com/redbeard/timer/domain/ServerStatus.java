package com.redbeard.timer.domain;

public class ServerStatus {

    private String status;

    private ServerStatus(String status) {
        this.status = status;
    }

    public static ServerStatus create(String status) {
        return new ServerStatus(status);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
