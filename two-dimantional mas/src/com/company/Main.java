package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    static void fillArray(int[][] arr) {
        Scanner scn = new Scanner(System.in);
        for (int l = 0; l < arr.length; l++) {
            for (int m = 0; m < arr[l].length; m++) {
                System.out.println("введите значения массива");
                arr[l][m] = scn.nextInt();
            }
        }
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
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
