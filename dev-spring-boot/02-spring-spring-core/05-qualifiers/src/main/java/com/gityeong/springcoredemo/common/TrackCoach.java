package com.gityeong.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Spend 18 minutes in track practice";
    }
}
