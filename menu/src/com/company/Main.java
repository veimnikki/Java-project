package com.company;
import java.util.Scanner;

public class Main {

    public static void frst() {
        System.out.println("сварщиков сейчас не так то и много");

    }

    public static void sec() {
        System.out.println("кушать юбиш?");

    }

    public static void third() {
        System.out.println("шо, мізки маєш?");

    }

    public static void main(String[] args) {
        System.out.println("выбери ябоку");
        System.out.print("1 - сварщик\n2 - повар\n3 - прогер\n");
        int yaboka;
        Scanner scn = new Scanner(System.in);
        yaboka = scn.nextInt();
        switch (yaboka){
            case 1:
                frst();
                break;
            case 2:
                sec();
                break;
            case 3:
                third();
                break;
            default:
                System.out.println("ты безработный");
        }

    }
}
