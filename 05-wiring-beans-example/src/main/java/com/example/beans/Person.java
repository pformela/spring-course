package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }


//    @Autowired(required = false)
//    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    @Autowired(required = true)
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }
}
