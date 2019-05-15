package com.michaelno;
import java.util.Scanner;
import java.text.DecimalFormat;

import static java.lang.Long.toBinaryString;

public class InputOutput {
    public void iO() {
        System.out.println("--------------------INPUT OUTPUT CLASS--------------------");
        System.out.println("---------------------- Ex 1 ----------------------");
        Scanner scanner = new Scanner(System.in);
        double x = 123.4567890123;
        System.out.println("x =" + x);
        DecimalFormat decimalFormat = new DecimalFormat("#.#####");
        System.out.println("x after format = " + decimalFormat.format(x));

        System.out.println("---------------------- Ex 2 ----------------------");
        String str;
        System.out.println("Input string: ");
        str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ascii = str.charAt(i);
            long j = ascii;
            Long binary = j;
            System.out.println("ASCII = " + ascii + " ASCII = " + j + " ASCII Binary = " + toBinaryString(binary));
        }
    }
}
