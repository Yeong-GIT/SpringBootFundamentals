package com.gityeong.springcoredemo.config;

import com.gityeong.springcoredemo.common.Coach;
import com.gityeong.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
