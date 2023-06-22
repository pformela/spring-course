package com.example.beans.speakers;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("boseSpeakers")
@Primary
public class BoseSpeakers implements Speakers {
    private String name = "Bose";

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
