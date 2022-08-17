package com.rishabh;

import java.util.Scanner;

public class AverageOfNnumbers {
    public static void main(String[] args) {
        int count =1;
        float num,average,sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int n = in.nextInt();
        while (count <= n){
            System.out.println("Enter the " +count+ " number:");
            num = in.nextInt();
            sum += num;
            ++count;
        }
        average = sum/n;
        System.out.println("The Average is: " +average);
    }
}
