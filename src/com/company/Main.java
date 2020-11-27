package com.company;

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
        Marek.getSalary();
        Marek.setSalary(50000.0);
        Marek.getSalary();
        Marek.setAuto(GD1212);






    }
}
