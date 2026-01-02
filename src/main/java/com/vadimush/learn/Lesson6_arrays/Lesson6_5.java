package com.vadimush.learn.Lesson6_arrays;

import java.util.Scanner;

public class Lesson6_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[]{1, 2, 3};
        int value;

        int min = nums[0];
        int max = nums[0];


        for (int i = 0; i < nums.length; i++) {
            System.out.print("Wpisz liczbe dla index " + i + ": ");
            value = scan.nextInt();

            nums[i] = value;
        }

        for (int i = 0; i < nums.length; i++) {
            if(min > nums[i]) {
                min = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Index: " + i + " liczba: " + nums[i]);
        }

        System.out.println(min);
        System.out.println(max);

    }

}
