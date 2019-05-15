package com.michaelno;

import java.util.Scanner;

public class ArithmeticOperator {
    public void calculate(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------ARITHMETIC OPERATOR CLASS--------------------");
        System.out.println("---------------------- Ex 1 ----------------------");
        long n;
        long hour;
        long min;
        long sec;

        System.out.println("Input sec (int): ");
        n = input.nextLong();
        hour = n / 60 / 60;
        min = n / 60 % 60;
        sec = n % 60;
        System.out.println("Time: " + hour + "h " + min + "m " + sec + "s");
        System.out.println("---------------------- Ex 2 ----------------------");
        float c;
        float f;
        System.out.println("Input C (int): ");
        c = input.nextFloat();
        f = c * 180 / 100 + 32;
        System.out.println("Temperature: " + c + "C = " + f + "F");
    }
}
