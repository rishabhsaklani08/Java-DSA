package com.rishabh;

import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int num = n;
        int reverse = 0;
        int remainder = 0;
        while (num != 0){
            remainder = num % 10;
            reverse = (reverse*10) + remainder;
            num /= 10;
        }
        if (reverse == n){
            System.out.println(n + " is a Palindrome Number");
        } else {
            System.out.println(n + " is not a Palindrome Number");
        }
    }
}
