package com.rishabh;

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        while (i <= num){
            sum += i;
            i++;
        }
        System.out.println("Sum of " + num + " numbers is: " + sum);
    }
}
