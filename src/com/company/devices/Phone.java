package com.company.devices;

public class Phone extends Device {

    Double screenSize;

    @Override
    public void turnOn() {
        System.out.println("Blip, slup, sru, włączone");
    }
}
