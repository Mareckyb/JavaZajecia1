package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog  = new Animal();
	dog.species = "dog";
	dog.name = "Haiko";
	dog.weight = 22.0;

	System.out.println(dog.name);
    System.out.println(dog.species);


        System.out.println(dog.weight);
        dog.goWalk(50);
        System.out.println(dog.weight);

        Car myCar = new Car();
        myCar.brand="mercedes";
        myCar.color="graphite";
        myCar.engine="Disel";




    }
}
