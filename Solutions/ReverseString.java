package com.rishabh;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "";
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to be reversed: ");
        String a = in.nextLine();
        System.out.println("Original Word: " +a);
        for (int i = 0; i < a.length(); i++) {
            ch= a.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println("Reversed String: " + reverse);
    }
}
