package org.ab.config;

import org.ab.beans.Person;
import org.ab.beans.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"com.example.implementation",
        "com.example.services"})
@ComponentScan(basePackageClasses = {org.ab.beans.Vehicle.class,
        org.ab.beans.Person.class})
public class ProjectConfig {

}