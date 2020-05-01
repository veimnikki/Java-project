package com.company;

public class XCar {

    XCar(String brand, int number, String color) {
        this.brand = brand;
        this.number = number;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public void setNumber(int number) {
        this.number = number;
    }

    private int number;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    private String brand;

    void beep() {
        System.out.println("beep-beep");
    }

    void printInfo() {
        System.out.println("Brand car is " + brand);
        System.out.println("Colour car is " + color);
        System.out.println("Car number is  " + number);
    }

}

