package com.company;

public class Main {

    public static void main(String[] args) {

        XCar Mazda = new XCar("Mazda", 3333, "yellow");
        XCar Porsche = new XCar("Porsche Cayene Panamera turbo", 7777, "space grey");
        XCar Lexus = new XCar ("Lexus", 6969, "white");

        XCar[] arr = new XCar[3];
        arr[0] = Mazda;
        arr[1] = Porsche;
        arr[2] = Lexus;

        for (int i = 0; i < arr.length; i++) {
            arr[i].printInfo();
            arr[i].beep();
        }

    }
}
