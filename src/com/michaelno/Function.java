package com.michaelno;

import java.util.Scanner;

public class Function {
    Scanner scanner = new Scanner(System.in);

    void circum(float d) {
        float c;
        c = (float) (d * (Math.PI));
        System.out.println("Circum of circle: " + c);
    }

    void area(float r) {
        float s;
        s = (float) (Math.pow(r, 2) * Math.PI);
        System.out.println("Area of circle: " + s);
    }

    void main() {
        System.out.println("--------------------FUNCTION CLASS--------------------");
        float r;
        float d;
        System.out.println("---------------------- Ex 1 ----------------------");
        System.out.println("Input diameter(float): ");
        d = scanner.nextFloat();
        r = d / 2;
        circum(d);
        area(r);
    }

    boolean checkPrimeNum(long n) {
        if (n < 2) return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
        }
        return true;
    }

    boolean checkPerfectNum(long n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) return true;
        else return false;
    }


    void main1() {
        System.out.println("---------------------- Ex 2 ----------------------");
        long n;
        System.out.println("Input n(long): ");
        n = scanner.nextLong();
        for (int i = 1; i < n; i++) {
            if (checkPrimeNum(i))
                System.out.println("Prime nums less than n: " + i);
        }
        long x = 500;
        System.out.println("Perfect num 1 -> 500: ");
        for (int i = 1; i <= x; i++) {
            if (checkPerfectNum(i)) System.out.println(i);
        }
    }

    int[] inputArray(int n) {
        int[] array = new int[50];
        for (int i = 0; i < n; i++) {
            System.out.println("Element[" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    void outputArray(int n, int[] result) {
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    void sumArray(int n, int[] result) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += result[i];
        }
        System.out.println("Sum = " + sum);
    }

    void outputNumber(int n, int[] result) {
        System.out.print("Even number: ");
        for (int i = 0; i < n; i++) {
            if (result[i] % 2 == 0) {
                System.out.print(result[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd number: ");
        for (int i = 0; i < n; i++) {
            if (result[i] % 2 != 0) {
                System.out.print(result[i] + " ");
            }
        }
    }

    void main2() {
        System.out.println("---------------------- Ex 3 ----------------------");
        int n;
        System.out.println("Input number of element: ");
        n = scanner.nextInt();
        int[] result = inputArray(n);
        outputArray(n, result);
        sumArray(n, result);
        outputNumber(n, result);
    }

    void main3() {
        System.out.println("---------------------- Ex 4 ----------------------");
        int[] array1 = {3, 2, 1, 4, 5, 7, 9, 8, 10, 12, 13, 9, 3, 2, 1, 5, 7};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        /*boolean check1 = false;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    check1 = true;
                }
            }
        }
        if (check1) System.out.println("The sequence number 2 is elements of sequence number 1");
        else System.out.println("The sequence number 2 isn't elements of sequence number 1");*/
       /* if(array2.length > array1.length){
            System.out.println("The sequence number 2 not inside sequence number 1");
        }else {
            int count = 0;
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array2[i] == array1[j]){
                        count++;
                        break;
                    }
                }
            }if(count == array2.length){
                System.out.println("The sequence number 2 inside sequence number 1");
            }else System.out.println("The sequence number 2 not inside sequence number 1");
        }*/
        boolean check = checkInside(array1, array2);
        if (check) System.out.println("The sequence number 2 inside sequence number 1");
        else System.out.println("The sequence number 2 not inside sequence number 1");
        check = checkElements(array1, array2);
        if (check) System.out.println("The sequence number 2 is elements of sequence number 1");
        else System.out.println("The sequence number 2 isn't elements of sequence number 1");

    }

    boolean checkInside(int[] array1, int[] array2) {
        if (array2.length > array1.length) {
            return false;
        } else {
            int count = 0;
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array2[i] == array1[j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count == array2.length) return true;
            else return false;
        }
    }

    boolean checkElements(int[] array1, int[] array2) {
        boolean check = false;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    check = true;
                }
            }
        }
        if (check) return true;
        else return false;
    }
}
