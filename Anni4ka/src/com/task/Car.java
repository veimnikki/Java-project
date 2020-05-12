package com.task;

public class Car extends Vehicle {

    Car(String name, int max_speed){
        super(name, max_speed);
    }

    void beepBeep() {
        System.out.printf("Car says ");
        super.beepBeep();
    }
}
