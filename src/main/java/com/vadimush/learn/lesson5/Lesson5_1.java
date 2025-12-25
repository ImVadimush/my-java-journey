package com.vadimush.learn.lesson5;

import java.util.Scanner;

public class Lesson5_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char choice = '1';

        int num1 = 0;
        int num2 = 0;

        do {
            System.out.println("1 - dodawanie");
            System.out.println("2 - odejmowanie");
            System.out.println("3 - mnozenie");
            System.out.println("4 - dzielenie");
            System.out.println("5 - exit");
            System.out.print("\nWybierz akcje: ");


            choice = scan.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Podaj 1 liczbe:  ");
                    num1 = scan.nextInt();

                    System.out.print("Podaj 2 liczbe:  ");
                    num2 = scan.nextInt();

                    System.out.println(num1 + num2);
                    break;
                case '2':
                    System.out.print("Podaj 1 liczbe:  ");
                    num1 = scan.nextInt();

                    System.out.print("Podaj 2 liczbe:  ");
                    num2 = scan.nextInt();

                    System.out.println(num1 - num2);
                    break;
                case '3':
                    System.out.print("Podaj 1 liczbe:  ");
                    num1 = scan.nextInt();

                    System.out.print("Podaj 2 liczbe:  ");
                    num2 = scan.nextInt();

                    System.out.println(num1 * num2);
                    break;
                case '4':
                    System.out.print("Podaj 1 liczbe:  ");
                    num1 = scan.nextInt();

                    System.out.print("Podaj 2 liczbe:  ");
                    num2 = scan.nextInt();

                    if(num2 == 0) {
                        System.out.println("Nie wolno dzielnie poprzez 0!");
                    } else {
                        System.out.println(num1 / num2);
                    }
                    break;
                case '5':
                    System.out.println("Wyjscie z programu...");
                    break;
                default: {
                    System.out.println("Cos nie tak wpisales!");
                }
            }
        } while (choice != '5');

    }
}