package com.robotfactory.Robotic.System.Controller;

import com.robotfactory.Robotic.System.Model.DecimalFormatterService;
import com.robotfactory.Robotic.System.Model.Speaker;
import com.robotfactory.Robotic.System.NotificationSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RobotController {

    @Autowired
    private Speaker speaker;

    @Autowired
    private NotificationSender notificationSender;

    @Autowired
    private DecimalFormatterService decimalFormatterService;

    @GetMapping("/")
    public String home(){
        return "Hello form RestController, got the mapping for home!";
    }

    @GetMapping(value = "/robot")
    public String speakFromRobot(){
        return speaker.sayHello();
    }

    @GetMapping("/info")
    public String info(){
        return "Robot accesses the endpoint " + speaker.getEndPoint()
                + " , with the maxRetryLimit=" + speaker.getRetryLimit();
    }

    @PostMapping("/robot/command")
    public String executeCommand(@RequestBody String command) {
        return "Command Received: '" + command + "'. Robot will now execute the task!";
    }

    @GetMapping("/notify")
    public String notification(){
        return notificationSender.send("operator@robotics.com", "Battery down..");
    }

    @GetMapping("/format")
    public String formatAmount(@RequestParam double amount){
        return decimalFormatterService.format(amount);
    }
}
