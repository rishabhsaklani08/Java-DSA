package com.rishabh;

import java.util.Scanner;

public class CalculateFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number whose factors you want: ");
        int a = in.nextInt();
        System.out.print("Factors of " + a + " are: ");

        for (int i = 1; i < a; ++i) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
