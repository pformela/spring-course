package com.example.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    private String name;
    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Vehicle Bean");
    }
}
