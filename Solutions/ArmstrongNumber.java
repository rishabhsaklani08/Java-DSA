package com.rishabh;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int temp = n;
        int result = 0;
        int s = 0;
        while (temp != 0){
            s = temp %10;
            result += Math.pow(s, 3);
            temp /= 10;
        }
        if (result == n){
            System.out.println(n + " is an Armstrong Number");
        } else {
            System.out.println(n + " is not an Armstrong Number");
        }
    }
}
