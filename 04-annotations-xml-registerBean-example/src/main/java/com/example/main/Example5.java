package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example5 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle volkswagen = new Vehicle();
        volkswagen.setName("Volkswagen");
        Supplier<Vehicle> volkswagenSupplier = () -> volkswagen;

        Supplier<Vehicle> audiSupplier = () -> {
            Vehicle audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("Random number = " + randomNumber);

        if ((randomNumber % 2) == 0) {
            context.registerBean("volkswagen", Vehicle.class, volkswagenSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volkswagenVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volkswagenVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException exception) {
            System.out.println("Error creating Volkswagen vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException exception) {
            System.out.println("Error creating Audi vehicle");
        }

        if (null != volkswagenVehicle) {
            System.out.println("Programming Vehicle name from Spring context is: " + volkswagenVehicle.getName());
        } else if (null != audiVehicle) {
            System.out.println("Programming Vehicle name from Spring context is: " + audiVehicle.getName());
        }

        context.close();
    }
}
