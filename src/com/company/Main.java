package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Device;

public class Main {

    public static void main(String[] args) {

// zadanie nr 1
        Animal dog = new Animal();
        while (dog.getWeight() >= 0) {
            dog.feed();
            dog.takeForAWalk();
            dog.takeForAWalk();
        }

//zadanie 2
        Car GD1212 = new Car();
        GD1212.price = 300000.0;

        Human Marek = new Human();
        Marek.firstName= "Marek";
        Marek.lastName = "Koszmarek";
        Marek.getSalary();
        Marek.setSalary(50000.0);
        Marek.getSalary();
        Marek.setAuto(GD1212);

        Device Nowy_model = new Device();

        System.out.println(Nowy_model);



    }
}
