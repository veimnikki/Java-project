package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
        for (int i = 0; a != -1; i++) {
            System.out.println("Введите значения массива (если хотите завершить, введите -1)");
            a = scn.nextInt();
            arr.add(a);
        }
        System.out.println(arr);
    }
}
