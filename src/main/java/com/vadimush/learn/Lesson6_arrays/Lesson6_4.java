package com.vadimush.learn.Lesson6_arrays;

import java.util.Scanner;

public class Lesson6_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = 0;
        int value;
        int suma;

        System.out.print("Ile chcesz wpisac liczb? ");
        x = scan.nextInt();

        int[] nums = new int[x];

        int min;
        int max;

        if(x == 0) {
            System.out.println("Nie wolno wpisywac 0");
        } else if(x > 0) {
            for (int i = 0; i < x; i++) {
                System.out.print("Wpisz liczbe " + i + ": ");
                value = scan.nextInt();

                nums[i] = value;
            }

            suma = 0;
            min = nums[0];
            max = nums[0];

            for(int i = 0; i < x; i++) {
                if(nums[i] < min) {
                    min = nums[i];
                }
                if(nums[i] > max) {
                    max = nums[i];
                }
                suma += nums[i];
            }

            System.out.println("");
            for(int i = 0; i < nums.length; i++) {
                System.out.println("Liczba #" + i + " :" + nums[i]);
            }

            System.out.println("\nSuma wszystkich liczb wynosi: " + suma);
            System.out.println("Minimalna liczba: " + min);
            System.out.println("Maksymalna liczba: " + max);
        } else {
            System.out.println("Cos wpisales nie tak!");
        }


    }
}
