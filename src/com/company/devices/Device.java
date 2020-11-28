package com.company.devices;

public abstract class Device {
    String model;
    String producer;
    Integer yearOfProduction;

    public abstract void turnOn();

    public String toString(){
        return (this.model+ " " + this.producer+" " + this.yearOfProduction);
    }
}
