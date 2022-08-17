package com.rishabh;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = in.nextInt();
        float area = (22/7) * (r*r);
        System.out.println("The area of circle is: " + area);
    }
}
