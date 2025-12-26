package com.vadimush.learn.lesson4_conditionals;

import java.util.Scanner;

public class Lesson4_3_calculator_using_switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int result = 0;
        boolean valid = true;

        // Input numbers and action
        System.out.print("Wpisz pierwsza liczbe: ");
        int num1 = scan.nextInt();

        System.out.print("Wpisz druga liczbe: ");
        int num2 = scan.nextInt();

        System.out.print("Podaj akcje dla tych liczba (+, -, *, /, %) ");
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
                    System.out.println("Nie wolno dzielic przez 0!");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Nieznana operacja!");
                valid = false;
        }

        if (valid) {
            System.out.println("Rezultat: " + result);
        }
    }
}