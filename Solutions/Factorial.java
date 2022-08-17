package com.rishabh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fact= 1;
        System.out.println("Factorial of n is the product of all positive descending integers.");
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n +" is: " +fact);
    }
}
