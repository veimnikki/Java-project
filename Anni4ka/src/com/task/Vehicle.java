package com.task;

public class Vehicle {

    Vehicle(String name, int max_speed){
        this.max_speed = max_speed;
        this.name = name;
    }

    public int max_speed;
    public String name;

    void beepBeep(){
        System.out.println("beep-beep!");
    }

}
