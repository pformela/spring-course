package com.example.beans.tyres;

import org.springframework.stereotype.Component;

@Component("bridgestoneTyres")
public class BridgestoneTyres implements Tyres {

    private String name = "Bridgestone";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String rotate() {
        return "Rotating " + this.name + " tyres.";
    }
}
