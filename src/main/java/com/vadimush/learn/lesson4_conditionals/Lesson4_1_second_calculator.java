package com.vadimush.learn.lesson4_conditionals;

import java.util.Scanner;

public class Lesson4_1_second_calculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result = 0;
        boolean valid = true;

        System.out.print("Press number 1: ");
        int num1 = scan.nextInt();

        System.out.print("Press number 2: ");
        int num2 = scan.nextInt();

        System.out.print("Press action (+, -, /, *, %): ");
        String action = scan.next();

        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("-")) {
            result = num1 - num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        } else if (action.equals("/")) {
            if (num2 == 0) {
                System.out.println("Nie wolno dzielic przez 0!");
                valid = false;
            } else {
                result = num1 / num2;
            }
        } else if (action.equals("%")) {
            result = num1 % num2;
        } else {
                System.out.println("Cos poszlo nie tak, chyba wpisales nie poprawna akcje dla liczb!");
                valid = false;
        }

        if (valid) {
            System.out.println(result);
        }
    }
}