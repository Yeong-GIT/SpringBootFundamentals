package com.gityeong.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Spend 10 minutes in tennis practice";
    }
}
