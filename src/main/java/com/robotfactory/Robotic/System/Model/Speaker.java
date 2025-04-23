package com.robotfactory.Robotic.System.Model;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Speaker {

    @Value("${robot.api.endpoint}")
    private String endPoint;

    @Value("${robot.api.endpoint.retry.limit}")
    private int retryLimit;


    public Speaker(){
        System.out.println("Speaker object created");
    }

    public String sayHello(){
        return "Hello, I'm the speaker component of the root";
    }

    public int getRetryLimit(){
        return retryLimit;
    }

    public String getEndPoint(){
        return endPoint;
    }
}
