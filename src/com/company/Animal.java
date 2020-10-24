package com.company;

import java.io.File;

public class Animal {

    static final Double MIN_WEIGHT = 2.0;
    String species;
    String name;
    Double weight = 10.0;
    File pic;

    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Thx for food");
    }

    Double getWeight() {
        return weight;
    }

    void goWalk(int time) {
        Double testWeight;

        testWeight = this.weight - time;

        if (testWeight >= MIN_WEIGHT) {
            this.weight = testWeight;
            System.out.println("Walk done");
        } else System.out.println("Feed first");

    }
}
