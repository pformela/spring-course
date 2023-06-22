package com.example.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle bean created by Spring");
    }
    private String name = "Toyota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @PostConstruct
//    public void initialize() {
//        this.name = "Audi";
//    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying Vehicle Bean");
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }
}
