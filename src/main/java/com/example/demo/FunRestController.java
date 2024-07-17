package com.example.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject some custom properties
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String sayHello() {
        return "hello!";
    }
    @GetMapping("/workout")
    public String getDailyWorkout() { return "Run a hard 5k!"; }
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day.";
    }
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + " | Team Name: " + teamName;
    }
}
