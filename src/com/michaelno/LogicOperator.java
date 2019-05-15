package com.michaelno;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Long.*;
import static java.lang.Long.toBinaryString;
import static java.lang.Long.toOctalString;

public class LogicOperator {
    public void calculate() {
        System.out.println("--------------------LOGIC OPERATOR CLASS--------------------");
        System.out.println("---------------------- Ex 1 ----------------------");
        Scanner scanner = new Scanner(System.in);
        long a;
        long b;
        long c;
        System.out.println("Input a(long): ");
        a = scanner.nextLong();
        System.out.println("Input b(long): ");
        b = scanner.nextLong();
        System.out.println("Input c(long): ");
        c = scanner.nextLong();
        System.out.println("(a>b) && (c<b) || ((30*c-a) > 0) = " + (((a > b) && (c < b)) || ((30 * c - a) > 0)));
        System.out.println("(30<b) || !(c<b) = " + ((30 < b) || !(c < b)));
        System.out.println("(b<= c+a) || (34+45 - 79) * 3 = " + ((b <= c + a) || (((34 + 45 - 79) * 3) > 0)));

        System.out.println("---------------------- Ex 2 ----------------------");
        //Cover Decimal to Hexa and Octa

        long d;
        System.out.println("Input decimal number: ");
        d = scanner.nextLong();
        System.out.println("Hex number of " + d + " is: " + toHexString(d));
        System.out.println("Oct number of " + d + " is: " + toOctalString(d));
    }

}
