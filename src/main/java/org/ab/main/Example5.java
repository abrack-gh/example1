package org.ab.main;

import org.ab.beans.Vehicle;
import org.ab.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean( Vehicle.class); // Not specified a bean so Lexus will be default
        System.out.println("Vehicle from Spring context is " + vehicle.getName());
        vehicle.hello();

    }
}
