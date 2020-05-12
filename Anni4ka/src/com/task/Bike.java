package com.task;

public class Bike extends Vehicle {

    Bike(String name, int max_speed){
        super(name, max_speed);
    }

    void beepBeep() {
        System.out.printf("bike says ");
        super.beepBeep();
    }

}
