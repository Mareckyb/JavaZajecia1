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
        Human Zenek = new Human();
        Zenek.auto = GD1212;



    }
}
