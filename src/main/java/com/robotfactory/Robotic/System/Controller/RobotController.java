package com.robotfactory.Robotic.System.Controller;

import com.robotfactory.Robotic.System.Model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class RobotController {

    @Autowired
    private Speaker speaker;

    @GetMapping("/")
    public String home(){
        return "Hello form RestController, got the mapping for home!";
    }

    @GetMapping(value = "/robot")
    public String speakFromRobot(){
        return speaker.sayHello();
    }

    @PostMapping("/robot/command")
    public String executeCommand(@RequestBody String command) {
        return "Command Received: '" + command + "'. Robot will now execute the task!";
    }
}
