package com.example.beans;

import com.example.beans.speakers.Speakers;
import com.example.beans.tyres.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
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
