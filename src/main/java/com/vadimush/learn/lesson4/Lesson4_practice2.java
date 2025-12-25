package com.vadimush.learn.lesson4;

import java.util.Scanner;

public class Lesson4_practice2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        boolean valid = true;
        boolean wtf = true;

        System.out.print("Wpisz 1 liczbe: ");
        int num1 = scan.nextInt();

        System.out.print("Wpisz 1 liczbe: ");
        int num2 = scan.nextInt();

        if(num1 == 0 || num2 == 0) {
            wtf = true;
        } else if(num1 != 0 && num2 != 0) {
            System.out.print("Wpisz akcje: ");
            char action = scan.next().charAt(0);

            switch (action) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        valid = false;
                    } else
                        result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    valid = false;
            }
        } else {
            System.out.print("Cos poszlo nie tak!");
        }

        if(wtf) {
            System.out.print("Po co liczyc?");
        } else if (!valid) {
            System.out.print("Cos poszlo nie tak!");
        } else if (valid) {
            System.out.print("Wychodzi: " + result);
        } else {
            System.out.print("Cos podales nie tak!");
        }
    }
}