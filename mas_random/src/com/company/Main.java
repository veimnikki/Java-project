package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void randomr (int[] arr) {
        int m = 0;
        while (m < arr.length) {
            Random r = new Random();
            int n = r.nextInt(10000);
            arr[m] = n;
            System.out.println(arr[m]);
            m++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        randomr(arr1);
    }
}
