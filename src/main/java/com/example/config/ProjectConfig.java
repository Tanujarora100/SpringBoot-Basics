package com.example.config;

import com.example.springbean.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    //    Scan The content of this class, IOC Container will read this class and initialize the Object.
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi8");
        return veh;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }

}
