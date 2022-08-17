package com.rishabh;

import java.util.Scanner;

public class DiscountPrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price of the product: Rs.");
        double original = in.nextDouble();

        System.out.print("Enter discount percentage: ");
        double dpercentage = in.nextDouble();

//        double s = (100 - discount);

        double discount = (dpercentage * original)/100;
        double finalprice = original - discount;
        System.out.println("Amount after discount= " +finalprice);
    }
}
