package com.task;

public class Truck extends Vehicle {

    Truck(String name, int max_speed){
        super(name, max_speed);
    }

    void beepBeep() {
        System.out.printf("track says ");
        super.beepBeep();
    }

}
