package org.launchcode.java.studios;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area {

    private static final double PI = 3.14;

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        double radius = in.nextDouble();

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        while (radius < 0){
            System.out.println(radius + " is invalid");
            System.out.println("Enter the radius of a circle:");
            radius = in.nextDouble();
        }

        double area = PI * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is " + df.format(area));

    }
}
