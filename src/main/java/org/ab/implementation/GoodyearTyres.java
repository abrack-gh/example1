package org.ab.implementation;

import org.ab.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class GoodyearTyres implements Tyres {

    public String rotate(){
        return "Goodyear tyres";
    }
}
