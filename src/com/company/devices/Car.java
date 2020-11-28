package com.company.devices;

public class Car extends Device {
    String engine;
    String color;
    public Double price;

    @Override
    public void turnOn() {
        System.out.println("Key turned, engine started, brum brum");
    }
}
