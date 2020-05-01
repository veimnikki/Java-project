package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int a = 0;
//        for(int j = 0; ;j++){
//            System.out.println("Введите элемент массива");
//            Scanner scn = new Scanner(System.in);
//            a = scn.nextInt();
//            if (a == -1) {
//                break;
//            }
//            arr.add(a);
//        }
        for (int i = 0; a != -1; i++) {
            System.out.println("Введите значения массива (если хотите завершить, введите -1)");
            a = scn.nextInt();
            arr.add(a);
        }



        for (int i = 0; i < arr.size() - 1; i++) {
            for (int l = 0; l < arr.size() - i - 1; l++) {
                if (arr.get(l) > arr.get(l + 1)) {
                    int tmp = arr.get(l);
                    arr.set(l+1, arr.get(l));
                    arr.set(l + 1, tmp);
                    }
                }
            }
        for (int i: arr) {
            System.err.println(i);
        }

    }
}
