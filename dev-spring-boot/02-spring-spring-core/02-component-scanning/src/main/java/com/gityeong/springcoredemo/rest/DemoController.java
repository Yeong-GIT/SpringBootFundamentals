package com.gityeong.springcoredemo.rest;

import com.gityeong.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

        //define a private field for the dependency
        private Coach myCoach;

        //define a constructor for dependency injection
        @Autowired
        public DemoController(Coach theCoach) {
            myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
            return myCoach.getDailyWorkout();
    }

    @GetMapping("/dailypumping")
    public String getDailyPumping() {
        return myCoach.getDailyPumping();
    }

    @GetMapping("/dailysquats")
    public String getNumberSquats() {
        return myCoach.getNumberSquats();
    }
}
