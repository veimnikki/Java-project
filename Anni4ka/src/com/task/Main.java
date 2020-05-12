package com.task;

public class Main {

    static int m, n;

    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        n = scn.nextInt();
//        m = scn.nextInt();
//        int[][] arr = new int[n][m];
//        for (int i=0; i < n; i++) {
//            for (int j=0; j < m; j++){
//            System.out.println("vvedite znacheniye: ");
//            arr[i][j]= scn.nextInt();
//            }
//        }
//        for (int i=0; i < n; i++) {
//            for (int j=0; j < m; j++){
//                System.out.printf(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        Car c = new Car("mersedes", 180);

        System.out.println(c.max_speed + " - max speed car");
        c.beepBeep();

        Bike b = new Bike ("toshiba", 300);

        System.out.println(b.max_speed + " - max speed bike");
        b.beepBeep();

        Truck t = new Truck("VAZ", 50);

        System.out.println(t.max_speed + " - max speed truck");
        t.beepBeep();

    }
}
