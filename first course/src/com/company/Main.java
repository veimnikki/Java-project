package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    static void fillArray(int[][] arr0) {
        Scanner scn = new Scanner(System.in);
        System.out.println("введите значения массива (строки)");
        for (int i = 0; i < arr0.length; i++)
            arr0[i][] = scn.nextInt();
        System.out.println("введите значения массива (столбцы)");
        for (int j = 0; j < arr0.length; j++)
            arr0[][j] = scn.nextInt();
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.println(arr[i][j] + "/t");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("введите кол-во строк");
        int n = scn.nextInt();
        System.out.println("введите кол-во столбцов");
        int k = scn.nextInt();
        int[][] arr1 = new int[n][k];
        fillArray(arr1);
        printArray(arr1);

    }
}
