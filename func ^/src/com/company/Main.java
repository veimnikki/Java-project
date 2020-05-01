package com.company;
import java.util.Scanner;

public class Main {

    public static int func(int k) {
        System.out.println("Происходит подстановка х в формулу x^2 - 8x + 4");
        System.out.println("Loading...");
        return k*k - 8*k +4;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        System.out.println("Введите значение x");
        n = scn.nextInt();
        System.out.println(func(n));
    }
}
