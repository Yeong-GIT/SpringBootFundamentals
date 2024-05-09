package com.gityeong.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 10 minutes in tennis practice";
    }
}
