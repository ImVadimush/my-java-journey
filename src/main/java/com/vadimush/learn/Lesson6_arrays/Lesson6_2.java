package com.vadimush.learn.Lesson6_arrays;

import java.util.Scanner;

public class Lesson6_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int value = 0;
        int min = arr[0][0];
        int max = arr[0][0];

        char ask = '0';

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("index " + i + " " + "kolumna " + j + ": ");
                value = scan.nextInt();

                arr[i][j] = value;
            }
        }

        System.out.println("\n\n[1] - Zobaczyc swoje dane");
        System.out.println("[2] - Zokanczyc program");
        System.out.print("Wybierz akcje: ");
        ask = scan.next().charAt(0);

        switch (ask) {
            case '1':
                min = arr[0][0];
                max = arr[0][0];

                System.out.println("Masz tu swoje dane: \n");

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }

                for (int i = 0; i < arr.length; i++) {
                    for (int j = 0; j < arr[i].length; j++) {

                        if (arr[i][j] < min) {
                            min = arr[i][j];
                        }
                    }

                    for (i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {

                            if (arr[i][j] < max) {
                                max = arr[i][j];
                            }
                            break;
                        }
                    }

                    System.out.println("\nMaksymalna liczba to: " + max);
                    System.out.println("Minimalnma liczba to: " + min);
                }
        }
    }
}