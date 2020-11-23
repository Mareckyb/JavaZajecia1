package com.company;

public class Animal {

    static final Double MIN_WEIGHT = 2.0;
    final String species = "Labrador";
    String name;
    private Double weight;

    public Animal() {
        if (species == "Labrador") weight = 25.5;
        else weight = 10.0;
    }


    void feed() {
        weight += 1;
        System.out.println("Thx for food");
    }

    Double getWeight() {
        return weight;
    }

    void takeForAWalk() {
        weight-= 1;
        if (weight>0) System.out.println("Wonderful Walk!!"); else System.out.println("Your dog is dead!!");
    }
}
