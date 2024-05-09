package com.gityeong.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice at bowling for 15 minutes";
    }

    @Override
    public String getDailyPumping(){
        return "Practice pumping for 15 minutes";
    }

    @Override
    public String getNumberSquats(){
        return "Practice squats 50 times a day";
    }
}
