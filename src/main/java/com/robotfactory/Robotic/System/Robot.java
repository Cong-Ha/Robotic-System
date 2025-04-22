package com.robotfactory.Robotic.System;

import com.robotfactory.Robotic.System.Model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //singleton by default, created bean on startup
//@Scope("prototype") //will not create bean at startup
public class Robot {

    @Autowired
    private Speaker speaker;

    public Robot() {
        System.out.println("Robot object created");
    }

    public void test(){
        System.out.println("test string from robot class");
    }

    public String speak(){
        return speaker.sayHello();
    }
}
