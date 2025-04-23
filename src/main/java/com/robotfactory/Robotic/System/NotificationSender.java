package com.robotfactory.Robotic.System;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NotificationSender {

    private final String fromEmail;

    public NotificationSender(@Value("${notification.from}") String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public String send(String to, String message) {
        return "Sending from " + fromEmail + " to " + to + ": " + message;
    }
}
