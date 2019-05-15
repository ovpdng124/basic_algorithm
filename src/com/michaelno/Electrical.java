package com.michaelno;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Electrical {
     void calculateE(){
        /** Electricty prices from 20/3/2019 **/

        Scanner scanner = new Scanner(System.in);
        final float a = 1678;
        final float b = 1734;
        final float c = 2014;
        final float d = 2536;
        final float e = 2834;
        final float f = 2927;

        double money;
        double kWh;
        System.out.println("Input kWh: ");
        kWh = scanner.nextFloat();
        if(kWh <= 50)
            money = kWh * a;
        else {
            money = 50 * a;
            kWh -= 50;
            if(kWh <= 50)
                money += kWh * 50;
            else {
                money = 50 * a + 50 * b;
                kWh -= 50;
                if(kWh <= 100)
                    money += kWh * c;
                else {
                    money = 50*a + 50*b + 100*c;
                    kWh -= 100;
                    if(kWh <= 100)
                        money += kWh * d;
                    else {
                        money = 50*a + 50*b + 100*c + 100*d;
                        kWh -= 100;
                        if(kWh <= 100)
                            money += kWh * f;
                        else {
                            money = 50*a + 50*b + 100*c + 100*d + 100*f;
                            kWh -= 100;
                            money += kWh * e;
                        }
                    }
                }
            }
        }
        Locale locale = new Locale("vi","VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String moneyVND = numberFormat.format(money);
        System.out.println("Money = " + moneyVND);
    }
}
