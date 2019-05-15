package com.michaelno;

import java.util.Random;
import java.util.Scanner;

public class Array {
    void array() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------ARRAY CLASS--------------------");
        System.out.println("---------------------- Ex 1 ----------------------");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Input value " + i + "(double): ");
            array[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Values in array[" + i + "]: " + array[i]);
        }
        double sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);

        System.out.println("---------------------- Ex 2 ----------------------");
        long[] array1 = new long[100];
        long n;
        long value;
        do {
            System.out.println("Enter the element num of the array: ");
            n = scanner.nextLong();
        } while (n > 100 || n < 0);
        for (int i = 0; i < n; i++) {
            System.out.println("Input value [" + (i + 1) + "](long): ");
            value = scanner.nextLong();
            array1[i] = value;
        }
        System.out.print("Array = ");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        long result = 1;
        for (int i = 0; i < n; i++) {
            result = result * array1[i];
        }
        System.out.println("Result multiplier: " + result);
        for (int i = 0; i < n; i++) {
            if (array1[i] % 5 == 0) {
                System.out.println("Element mod 5: " + array1[i]);
            }
        }
        long k;
        System.out.println("Input K (long): ");
        k = scanner.nextLong();
        boolean check = true;
        for (int i = 0; i < n; i++) {
            if (k == array1[i]) {
                System.out.println("Elements[" + i + "] = K: " + array1[i]);
                check = false;
            }
        }
        if (check) System.out.println("None!");

        System.out.println("---------------------- Ex 3 ----------------------");
        long[] array2 = new long[100];
        long n1;
        do {
            System.out.println("Enter the element num of the array: ");
            n1 = scanner.nextLong();
        } while (n1 > 100 || n1 < 0);
        for (int i = 0; i < n1; i++) {
            System.out.println("Input value [" + (i + 1) + "](long): ");
            value = scanner.nextLong();
            array2[i] = value;
        }
        System.out.print("Array = ");
        for (int i = 0; i <= n1 - 1; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        long temp = 1;
        for (int i = 0; i < n1; i++) {
            for (int j = i + 1; j < n1; j++) {
                if (array2[i] > array2[j]) {
                    temp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        System.out.print("Array order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        System.out.println("---------------------- Ex 4 ----------------------");
        long[][] multi_Array = new long[50][50];
        long rows;
        long cols;
        System.out.println("Input rows: ");
        rows = scanner.nextLong();
        System.out.println("Input cols: ");
        cols = scanner.nextLong();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Input row[" + i + "] - col[" + j + "]: ");
                multi_Array[i][j] = scanner.nextLong();
            }
        }
        System.out.println("Elements of array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(multi_Array[i][j] + " ");
            }
            System.out.println();
        }
        long sums = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sums += multi_Array[i][j];
            }
        }
        System.out.println("Sums = " + sums);

        System.out.println("---------------------- Ex 5 ----------------------");
        long[][] multi_Array1 = new long[50][50];
        System.out.println("Input rows: ");
        rows = scanner.nextLong();
        System.out.println("Input cols: ");
        cols = scanner.nextLong();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Random random = new Random();
                int x = random.nextInt(21);
                multi_Array1[i][j] = x;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int ij = j + 1; ij < cols; ij++) {
                    long temp1;
                    if (multi_Array1[i][j] > multi_Array1[i][ij]) {
                        temp1 = multi_Array1[i][j];
                        multi_Array1[i][j] = multi_Array1[i][ij];
                        multi_Array1[i][ij] = temp1;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Elements of Array = ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(multi_Array1[i][j] + " ");
            }
            System.out.println();
        }
        long[] oneDi_Array = new long[100];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDi_Array[count] = multi_Array1[i][j];
                count++;
            }
        }
        System.out.println("Elements of One dimensional array: ");
        for (int i = 0; i < (rows * cols); i++) {
            System.out.print(oneDi_Array[i] + " ");
            if ((i + 1) % cols == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
