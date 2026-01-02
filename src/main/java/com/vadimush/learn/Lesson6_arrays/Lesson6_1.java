package com.vadimush.learn.Lesson6_arrays;

import java.util.Scanner;

public class Lesson6_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int value = 0;
        int arr[] = new int[] {3, 5, 7, 9};
        int min = arr[0];
        int max = arr[0];

        char ask = '0';

        for(int i = 0; i < arr.length; i++) {
            System.out.print("Wpisz liczbe dla index'a " + i + ": ");
            value = scan.nextInt();

            arr[i] = value;
        }

        System.out.println("\n\n[1] - Zobaczyc swoje dane");
        System.out.println("[2] - Zokanczyc program");
        System.out.print("Wybierz akcje: ");
        ask = scan.next().charAt(0);

        switch (ask) {
            case '1':
                min = arr[0];
                max = arr[0];

                System.out.println("Masz tu swoje dane: \n");

                for (int i = 0; i < arr.length; i++) {
                    System.out.println(i + ". " + arr[i]);
                }

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }

                for (int i = 0; i < arr.length; i++) {

                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                System.out.println("\nMaksymalna liczba to: " + max);
                System.out.println("Minimalnma liczba to: " + min);
                break;
            case '2':
                System.out.println("Trwa wyjscie z programu.. Seekunda");
                break;
            default: {
                System.out.println("Cos wpisales nie tak!");
            }
        }
    }
}
