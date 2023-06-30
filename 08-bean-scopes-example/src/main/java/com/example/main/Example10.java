package com.example.main;

import com.example.beans.Person;
import com.example.beans.VehicleServices;
import com.example.beans.tyres.MichellinTyres;
import com.example.beans.tyres.Tyres;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the Person bean from the Spring Context");
        Person p = context.getBean(Person.class);
        System.out.println("After retrieving the Person bean from the Spring Context");

        Tyres mt1 = context.getBean(MichellinTyres.class);
        Tyres mt2 = context.getBean("michellinTyres", MichellinTyres.class);
        System.out.println("Hashcode of mt1 is: " + mt1.hashCode());
        System.out.println("Hashcode of mt2 is: " + mt2.hashCode());

        if (mt1 == mt2) {
            System.out.println("MichellinTyres bean is a singleton scoped bean");
        } else {
            System.out.println("MichellinTyres bean is a prototype scoped bean");
        }

        context.close();
    }
}
