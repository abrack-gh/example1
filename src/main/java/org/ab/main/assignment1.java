package org.ab.main;

import org.ab.beans.Person;
import org.ab.beans.Vehicle;
import org.ab.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class assignment1 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().rotate();
    }
}
