package com.vadimush.learn.lesson5;

import java.util.Scanner;

public class Lesson5_2_authemicator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String login = "";
        String password = "";

        char action = '0';
        char function = '0';

        int num1 = 0;
        int num2 = 0;

        boolean isAuthorized = false;

        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "  ___        _   _               _   _           _             \n" +
                    " / _ \\ _   _| |_| |__   ___ _ __ | |_(_) ___ __ _| |_ ___  _ __ \n" +
                    "| | | | | | | __| '_ \\ / _ \\ '_ \\| __| |/ __/ _` | __/ _ \\| '__|\n" +
                    "| |_| | |_| | |_| | | |  __/ | | | |_| | (_| (_| | || (_) | |   \n" +
                    " \\___/ \\__,_|\\__|_| |_|\\___|_| |_|\\__|_|\\___\\__,_|\\__\\___/|_|   \n" +
                    "     version: 1.0.0             |           by VadimuIII" +
                    "\n");

            System.out.print("Wpisz login: ");
            login = scan.nextLine();

            System.out.print("Wpisz haslo: ");
            password = scan.nextLine();

            if (login.equals("admin") && password.equals("123")) {
                isAuthorized = true;
            }
        } while(!isAuthorized);

        do {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "  ___        _   _               _   _           _             \n" +
                    " / _ \\ _   _| |_| |__   ___ _ __ | |_(_) ___ __ _| |_ ___  _ __ \n" +
                    "| | | | | | | __| '_ \\ / _ \\ '_ \\| __| |/ __/ _` | __/ _ \\| '__|\n" +
                    "| |_| | |_| | |_| | | |  __/ | | | |_| | (_| (_| | || (_) | |   \n" +
                    " \\___/ \\__,_|\\__|_| |_|\\___|_| |_|\\__|_|\\___\\__,_|\\__\\___/|_|   \n" +
                    "     version: 1.0.0             |           by VadimuIII" +
                    "\n");


            System.out.println("[1] - Kalkulator");
            System.out.println("[2] - Szybki dostep");
            System.out.println("[3] - exit");

            System.out.print("\nWybierz akcje: ");
            action = scan.next().charAt(0);

            switch (action) {
                case '1':

                    System.out.print("Podaj akcje (+, -, *, /, %): ");
                    function = scan.next().charAt(0);

                    // Input numbers
                    System.out.print("Wpisz liczbe 1: ");
                    num1 = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Wpisz liczbe 2: ");
                    num2 = scan.nextInt();
                    scan.nextLine();

                    //Calculation logic
                    switch (function) {
                        case '+':
                            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                            break;
                        case '-':
                            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                            break;
                        case '*':
                            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                            break;
                        case '/':
                            if (num2 == 0) {
                                System.out.println("Nie wolno dzielic poprzez 0!");
                            } else {
                                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                            }
                            break;
                        case '%':
                            if (num2 == 0) {
                                System.out.println("Po co liczyc reszte od 0?");
                            } else {
                                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                            }
                            break;
                        default: {
                            System.out.println("Cos podales nie tak!");
                        }
                    }

                    break;
                case '2':
                    System.out.println("W krotce zostanie zrealizowane!");
                    break;
                case '3':
                    System.out.println("Wyjsice z programu...");
                    break;
                default: {
                    System.out.println("Cos nie tak wpisales!");
                }
            }
        } while(action != '3');

    }
}