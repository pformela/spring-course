package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean("audiVehicle")
    Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi");

        return veh;
    }

    @Primary
    @Bean("toyotaVehicle")
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Toyota");

        return veh;
    }

    @Bean("bmwVehicle")
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("BMW");

        return veh;
    }

}
