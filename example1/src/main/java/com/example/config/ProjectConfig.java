package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi A6");

        return veh;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 42;
    }

}
