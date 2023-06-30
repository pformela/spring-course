package com.example.main;

import com.example.beans.VehicleServices;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        VehicleServices vs1 = context.getBean(VehicleServices.class);
        VehicleServices vs2 = context.getBean("vehicleServices", VehicleServices.class);

        System.out.println("Hashcode of the object vs1: " + vs1.hashCode());
        System.out.println("Hashcode of the object vs2: " + vs2.hashCode());
        if (vs1 == vs2) {
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }
    }
}
