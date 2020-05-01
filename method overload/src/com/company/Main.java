package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество чисел с которыми хотите произвести махинации (от 2 дл 4 включительно):");
        int a, b, c, d;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        switch (n) {
            case 2:
                System.out.println("Введите первое число для махинации:");
                a = scn.nextInt();
                System.out.println("Введите второе число для махинации:");
                b = scn.nextInt();
                System.out.println(two(a, b));
                break;
            case 3:
                System.out.println("Введите первое число для махинации:");
                a = scn.nextInt();
                System.out.println("Введите второе число для махинации:");
                b = scn.nextInt();
                System.out.println("Введите третье число для махинации:");
                c = scn.nextInt();
                System.out.println(three(a, b, c));
                break;
            case 4:System.out.println("Введите первое число для махинации:");
                a = scn.nextInt();
                System.out.println("Введите второе число для махинации:");
                b = scn.nextInt();
                System.out.println("Введите третье число для махинации:");
                c = scn.nextInt();
                System.out.println("Введите четвертое число для махинации:");
                d = scn.nextInt();
                System.out.println(four(a, b, c, d));
                break;
            default: System.out.println("you are looser");
            break;
        }
    }

    static int two (int x, int y) {
        return x + y;
    }

    static int three (int x, int y, int z) {
         return x + y + z;
    }

    static int four (int x, int y, int z, int a) {
        return x + y + z + a;
    }
}
