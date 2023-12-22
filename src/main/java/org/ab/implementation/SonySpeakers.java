package org.ab.implementation;

import org.ab.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {

    public String makeSound(){
        return "Making sound with SonySpeakers";
    }

}

