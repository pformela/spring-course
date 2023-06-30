package com.example.beans;

import com.example.beans.speakers.Speakers;
import com.example.beans.tyres.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class VehicleServices {

    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public String playMusic() {
        return this.speakers.makeSound();
    }

    public String moveVehicle() {
        return this.tyres.rotate();
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
