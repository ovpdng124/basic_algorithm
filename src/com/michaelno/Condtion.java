package com.michaelno;


import java.util.Scanner;

public class Condtion {
    public void compare() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------CONDITION CLASS--------------------");
        System.out.println("---------------------- Ex 1 ----------------------");

        long n;
        System.out.println("Input number: ");
        n = scanner.nextLong();
        if (n >= 0) {
            System.out.println(n + " is positive num");
        } else System.out.println(n + " is negative num");

        System.out.println("---------------------- Ex 2 ----------------------");

        long a;
        long b;
        System.out.println("Input a(long): ");
        a = scanner.nextLong();
        System.out.println("Input b(long): ");
        b = scanner.nextLong();
        if (a > b) {
            System.out.println("Greatest value: " + a);
        }
        if (a < b) {
            System.out.println("Greatest value: " + b);
        }
        if (a == b) {
            System.out.println("Both equal");
        }

        System.out.println("---------------------- Ex 3 ----------------------");

        //Calculate the electrical num

        final float c = 500;
        final float d = 1000;
        final float e = 1500;
        final float f = 2000;
        final float g = 2500;

        float money = 0;
        float kWh;
        System.out.println("Input kWh(float): ");
        kWh = scanner.nextFloat();
        if (kWh <= 50) {
            money = kWh * c;
        } else {
            money = 50 * c;
            kWh -= 50;
            if (kWh <= 100) {
                money += kWh * 100;
            } else {
                money = 50 * c + 100 * d;
                kWh -= 100;
                if (kWh <= 50) {
                    money += kWh * e;
                } else {
                    money = 50 * c + 100 * d + 50 * e;
                    kWh -= 50;
                    if (kWh <= 100) {
                        money += kWh * f;
                    } else {
                        money = 50 * c + 100 * d + 50 * e + 100 * f;
                        kWh -= 100;
                        money += kWh * g;
                    }
                }
            }
        }

        System.out.println("Money = " + money + "VND");

        System.out.println("---------------------- Ex 3 ----------------------");
        long year;
        System.out.println("Input Year: ");
        year = scanner.nextLong();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year!");
        } else System.out.println("Isn't Leap Year");

        System.out.println("---------------------- Ex 4 ----------------------");
        Long scores;
        System.out.println("Input Scores(0 -> 10): ");
        scores = scanner.nextLong();
        if(scores == null || scores < 0){
            System.out.println("Scores can't empty or less than 0");
        }
        if(scores > 10)System.out.println("Score must be less than 11");
        if(scores > 8 && scores <= 10){
            System.out.println("Excellent");
        }else{
            if(scores > 6 && scores <= 8){
                System.out.println("Rather");
            }
            if(scores > 4 && scores <= 6 ){
                System.out.println("Medium");
            }else {
                if(scores >= 0 && scores <= 4)System.out.println("Bad!!!");
            }
        }
    }

}
