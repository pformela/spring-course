package com.example.beans.tyres;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("michellinTyres")
@Primary
public class MichellinTyres implements Tyres {
    private String name = "Michellin";

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
