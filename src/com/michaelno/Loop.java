package com.michaelno;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    void loop() {
        System.out.println("--------------------LOOP CLASS--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------- Ex 1 ----------------------");
        long s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i * i;
        }
        System.out.println("S = 1+2+3....+10");
        System.out.println("S = " + s);

        System.out.println("---------------------- Ex 2 ----------------------");
        long n;
        System.out.println("Input n(long): ");
        n = scanner.nextLong();
        long sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.println("S = 1*2*3....*n");
        System.out.println("result: " + sum);

        System.out.println("---------------------- Ex 3 ----------------------");
        long a = 4;
        System.out.println("Even number > 2: ");
        while (a < 100) {
            System.out.print(a + " ");
            a += 2;
        }

        System.out.println("---------------------- Ex 4 ----------------------");
        long p;
        long x = 2;
        boolean b = true;
        System.out.println("Input p(long): ");
        p = scanner.nextLong();
        if (p != 1) {
            if (p != 2) {
                while (x <= Math.sqrt(p)) {
                    if (p % x == 0) {
                        b = false;
                        break;
                    }
                    x++;
                }
            }
        } else b = false;
        if (b) System.out.println("Is prime num");
        else System.out.println("Isn't prime num");

        System.out.println("---------------------- Ex 5 ----------------------");
        long c;
        do {
            System.out.println("Input c = 0 will be looped: ");
            c = scanner.nextLong();
        } while (c == 0);
        System.out.println("c = " + c);
        System.out.println("---------------------- Ex 6 ----------------------");
        scanner.nextLine();
        double wallet = 10000;
        double input;
        boolean check = true;
        String action;
        do {
            System.out.println("Enter W to withdrawal");
            System.out.println("Enter P to payment");
            System.out.println("Enter V to view your wallet");
            System.out.println("Enter E to exit");
            System.out.println("==========================================");
            System.out.println("Input here: ");
            action = scanner.nextLine();
            System.out.println("");
            switch (action) {
                case "W":
                    System.out.println("Input withdrawal: ");
                    input = scanner.nextDouble();
                    scanner.nextLine();
                    if (input % 10000 == 0) {
                        if (input <= wallet) {
                            System.out.println("Withdrawal successfully: " + input);
                            wallet -= input;
                            System.out.println("Balance in the wallet: " + wallet);
                        } else System.out.println("The amount in the wallet isn't enough");
                    } else System.out.println("The amount entered must be divided for 10.000");
                    System.out.println("==========================================");
                    break;
                case "P":
                    System.out.println("Input money payment: ");
                    input = scanner.nextDouble();
                    scanner.nextLine();
                    wallet += input;
                    System.out.println("Balance in the wallet: " + wallet);
                    System.out.println("==========================================");
                    break;
                case "V":
                    System.out.println("Balance in the wallet: " + wallet);
                    System.out.println("==========================================");
                    break;
                case "E":
                    System.out.println("Exit!");
                    check = false;
            }
        }while (check);

        System.out.println("---------------------- Ex 7 ----------------------");
        int i,j;
        System.out.println("Multiplication table");
        for(i = 1; i <= 9; i++){
            System.out.println();
            for(j = 2; j <= 9; j++){
                System.out.print(j + " x " + i + " = " + (i*j) + "   ");
            }
        }

        System.out.println();
        System.out.println("---------------------- Ex 8 ----------------------");

        for(i = 1; i <= 11 ; i += 2){
            for(j = 1; j <= i ; j += 2){
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}

