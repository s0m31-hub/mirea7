package org.nwolfhub;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("3 стороны, цвет, заливка");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        for(int i = 0; i<3; i++) {
            sc.nextLine();
        }
        String color = sc.nextLine();
        boolean fill = sc.nextBoolean();
        sc.close();
        Triangle triangle = new Triangle(color, fill, d1, d2, d2);

    }
}