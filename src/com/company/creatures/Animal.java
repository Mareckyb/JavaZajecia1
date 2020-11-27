package com.company.creatures;

public class Animal {

    static public final Double MIN_WEIGHT = 2.0;
    final public String species = "Labrador";
    String name;
    public Double weight;

    public Animal() {
        if (species == "Labrador") weight = 25.5;
        else weight = 10.0;
    }


    public void feed() {
        weight += 1;
        System.out.println("Thx for food");
    }

    public Double getWeight() {
        return weight;
    }

    public void takeForAWalk() {
        weight-= 1;
        if (weight>0) System.out.println("Wonderful Walk!!"); else System.out.println("Your dog is dead!!");
    }
}
