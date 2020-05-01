package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество ячеек массива:");
        int a = scn.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\nВведите значение " + (i+1) + " элемента массива");
            int b = scn.nextInt();
            arr[i] = b;
        }
        int max = arr[0];
        for (int j = 1;j < arr.length;j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        int min = arr[0];
        for (int k = 1;k < arr.length;k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        System.out.println("\nМаксимальное значение: " + max + "; Минимальное значение: " + min);
    }
}


