package com.rishabh;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter the length: ");
        int l = in.nextInt();
        System.out.println("Please Enter the height: ");
        int h = in.nextInt();
        double area = l *h;
        System.out.println("The area of Rectangle is: " + area);
    }
}
