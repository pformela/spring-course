package com.example.beans.speakers;

import org.springframework.stereotype.Component;

@Component("sonySpeakers")
public class SonySpeakers implements Speakers {
    private String name = "Sony";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return this.name + " speakers making sound.";
    }
}
