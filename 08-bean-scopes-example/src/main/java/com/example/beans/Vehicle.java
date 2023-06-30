package com.example.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    private String name = "Audi";
    private VehicleServices vs;

    @Autowired
    public Vehicle(VehicleServices vehicleServices) {
        this.vs = vehicleServices;
    }

    public VehicleServices getVs() {
        return vs;
    }

    public void setVs(VehicleServices vs) {
        this.vs = vs;
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
