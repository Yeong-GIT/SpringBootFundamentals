package com.gityeong.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Practice at bowling for 15 minutes";
    }
}
