package com.company;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Hello! Enter 1 number:");
        arr[0] = scn.nextInt();
        System.out.println("Enter 2 number:");
        arr[1] = scn.nextInt();
        System.out.println("Enter 3 numbe:");
        arr[2] = scn.nextInt();
        System.out.println("Enter 4 number:");
        arr[3] = scn.nextInt();
        System.out.println("Enter 5 number:");
        arr[4] = scn.nextInt();
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}