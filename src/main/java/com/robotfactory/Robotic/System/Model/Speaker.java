package com.robotfactory.Robotic.System.Model;


import org.springframework.stereotype.Service;

@Service
public class Speaker {
    public Speaker(){
        System.out.println("Speaker object created");
    }

    public String sayHello(){
        return "Hello, I'm the speaker component of the root";
    }
}
