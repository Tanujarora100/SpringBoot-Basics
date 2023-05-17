package com.example.main;

import com.example.config.ProjectConfig;
import com.example.springbean.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {
    public static void main(String[] args) {
        var vehicle = new Vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle name without IOC is :" + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("THROUGH IOC VEHICLE Name is " + veh.getName());
//        System.out.println(context.getBean("hello"));
        String str= context.getBean("hello",String.class);
        System.out.println(str);
        Integer number= context.getBean(Integer.class);
        System.out.println(number);
    }
}
