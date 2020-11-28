package com.company.devices;

public class Device {
    String model;
    String producer;
    Integer yearOfProduction;

    public String toString(){
        return (this.model+ " " + this.producer+" " + this.yearOfProduction);
    }
}
