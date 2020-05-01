package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Какое кол-во ячеек Вы хотите выделить в своем массиве?");
        int n = scn.nextInt();
        if (n % 2 == 0) {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length - 1; i += 2) {
                System.out.println("Введите значение " + (i+1) + " элемента Вашего массива:");
                int a = scn.nextInt();
                System.out.println("Введите значение " + (i+2) + " элемента Вашего массива:");
                int b = scn.nextInt();
                arr[i] = a;
                arr[i + 1] = b;
                System.out.println("Их сумма: " + (a + b));
            }
        } else {
            System.out.println("You are invalid :(");
        }
    }
}

