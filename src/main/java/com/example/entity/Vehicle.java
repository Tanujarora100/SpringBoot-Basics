package com.example.entity;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
