package com.example.beans.tyres;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("michellinTyres")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
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
