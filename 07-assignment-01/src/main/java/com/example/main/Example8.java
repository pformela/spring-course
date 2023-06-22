package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);

        System.out.println("Person name from Spring Context is: " + person.getName());
        System.out.println("Vehicle that " + person.getName() + " owns is: " + person.getVehicle().getName());
        System.out.println("Vehicle has " + person.getVehicle().getVs().getTyres().getName() + " tyres.");
        System.out.println("Vehicle has " + person.getVehicle().getVs().getSpeakers().getName() + " speakers.");
        System.out.println(person.getVehicle().getVs().playMusic());
        System.out.println(person.getVehicle().getVs().moveVehicle());

        context.close();
    }
}
