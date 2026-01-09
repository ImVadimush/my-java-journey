package com.vadimush.learn.Lesson7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson7_2_authemicator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Two lists: one for tasks, one for their status (parallel arrays)
        ArrayList<String> doList = new ArrayList<>();
        ArrayList<String> doStatus = new ArrayList<>();

        // Login variables
        String login;
        String password;

        // Main menu choice
        char action;

        // Calculator variables
        char function;
        int num1;
        int num2;

        // TODO list variables
        char addAction;
        char doAction;
        int doRemove;
        String doValue;

        // Status change variables
        int doEditStatus;
        char doChoiceStatus;
        String doSetStatus = "";

        boolean isAuthorized = false;

        // LOGIN LOOP - keeps asking until correct credentials
        do {
            // Display ASCII logo and login prompt
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "  ___        _   _               _   _           _             \n" +
                    " / _ \\ _   _| |_| |__   ___ _ __ | |_(_) ___ __ _| |_ ___  _ __ \n" +
                    "| | | | | | | __| '_ \\ / _ \\ '_ \\| __| |/ __/ _` | __/ _ \\| '__|\n" +
                    "| |_| | |_| | |_| | | |  __/ | | | |_| | (_| (_| | || (_) | |   \n" +
                    " \\___/ \\__,_|\\__|_| |_|\\___|_| |_|\\__|_|\\___\\__,_|\\__\\___/|_|   \n" +
                    "     version: 1.1.0             |           by VadimuIII" +
                    "\n");

            System.out.print("Wpisz login: ");
            login = scan.nextLine();

            System.out.print("Wpisz haslo: ");
            password = scan.nextLine();

            // Hardcoded authentication (admin/123)
            if (login.equals("admin") && password.equals("123")) {
                isAuthorized = true;
            }
        } while(!isAuthorized);

        // MAIN APPLICATION LOOP - runs until user chooses exit (4)
        do {
            // Display main menu
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                    "  ___        _   _               _   _           _             \n" +
                    " / _ \\ _   _| |_| |__   ___ _ __ | |_(_) ___ __ _| |_ ___  _ __ \n" +
                    "| | | | | | | __| '_ \\ / _ \\ '_ \\| __| |/ __/ _` | __/ _ \\| '__|\n" +
                    "| |_| | |_| | |_| | | |  __/ | | | |_| | (_| (_| | || (_) | |   \n" +
                    " \\___/ \\__,_|\\__|_| |_|\\___|_| |_|\\__|_|\\___\\__,_|\\__\\___/|_|   \n" +
                    "     version: 1.1.0             |           by VadimuIII" +
                    "\n");

            System.out.println("[1] - Kalkulator");
            System.out.println("[2] - To-Do list");
            System.out.println("[3] - Szybki dostep");
            System.out.println("[4] - exit");

            System.out.print("\nWybierz akcje: ");
            action = scan.next().charAt(0);

            switch (action) {
                case '1': // CALCULATOR
                    System.out.print("Podaj akcje (+, -, *, /, %): ");
                    function = scan.next().charAt(0);
                    scan.nextLine();

                    System.out.print("Wpisz liczbe 1: ");
                    num1 = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Wpisz liczbe 2: ");
                    num2 = scan.nextInt();
                    scan.nextLine();

                    // Calculator logic with division by zero check
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

                case '2': // TODO LIST - has its own sub-menu
                    do {
                        // TODO list sub-menu options
                        System.out.println("\n[1] - Dodac index");
                        System.out.println("[2] - Usunac index");
                        System.out.println("[3] - Wyswietlic cala liste");
                        System.out.println("[4] - Usunac cala liste");
                        System.out.println("[5] - zmienic status");
                        System.out.println("[6] - Powrot na glowna strone");

                        System.out.print("\nWybierz akcje: ");
                        doAction = scan.next().charAt(0);
                        scan.nextLine();

                        switch (doAction) {
                            case '1': // ADD TASK
                                System.out.print("Wpisz nazwe, ktora chcesz dodac: ");
                                doValue = scan.nextLine();
                                doList.add(doValue);

                                // Task status selection (1-3)
                                System.out.println("\nZaznacz status dla nazwy: " + doValue + ": ");
                                System.out.println("[1] - Dopiero dodany");
                                System.out.println("[2] - W toku");
                                System.out.println("[3] - Zakonczony");
                                System.out.print("Wybierz akcje: ");
                                doChoiceStatus = scan.nextLine().charAt(0);

                                switch (doChoiceStatus) {
                                    case '1':
                                        doSetStatus = "dopiero dodany";
                                        break;
                                    case '2':
                                        doSetStatus = "w toku";
                                        break;
                                    case '3':
                                        doSetStatus = "zakonczony";
                                        break;
                                    default: {
                                        System.out.println("Cos poszlo nie tak!");
                                    }
                                }

                                doStatus.add(doSetStatus);
                                System.out.println("Sukces! Dodan index o nazwie: " + doValue + " - " + doSetStatus + ".\n");

                                // Option to add more tasks without returning to menu
                                do {
                                    System.out.println("[1] - Dodac jeszcze");
                                    System.out.println("[2] - Powrot");
                                    System.out.print("Wybierz akcje: ");
                                    addAction = scan.nextLine().charAt(0);

                                    switch (addAction) {
                                        case '1': // Add another task
                                            System.out.print("Wpisz nazwe, ktora chcesz dodac: ");
                                            doValue = scan.nextLine();
                                            doList.add(doValue);

                                            System.out.println("\nZaznacz status dla nazwy: " + doValue + ": ");
                                            System.out.println("[1] - Dopiero dodany");
                                            System.out.println("[2] - W toku");
                                            System.out.println("[3] - Zakonczony");
                                            System.out.print("Wybierz akcje: ");
                                            doChoiceStatus = scan.nextLine().charAt(0);

                                            switch (doChoiceStatus) {
                                                case '1':
                                                    doSetStatus = "dopiero dodany";
                                                    break;
                                                case '2':
                                                    doSetStatus = "w toku";
                                                    break;
                                                case '3':
                                                    doSetStatus = "zakonczony";
                                                    break;
                                                default: {
                                                    System.out.println("Cos poszlo nie tak!");
                                                }
                                            }

                                            doStatus.add(doSetStatus);
                                            System.out.println("Sukces! Dodan index o nazwie: " + doValue + " - " + doSetStatus + ".\n");
                                            break;

                                        case '2': // Return to TODO menu
                                            System.out.println("\nPowrot na glowna strone To-Do List...");
                                            break;

                                        default: {
                                            System.out.println("Cos poszlo nie tak!");
                                        }
                                    }

                                } while (addAction != '2');
                                break;

                            case '2': // REMOVE TASK BY INDEX
                                if(doList.isEmpty()) {
                                    System.out.println("\nTy nie mozesz usunac index, poniewaz nie ma zadnego!");
                                } else {
                                    System.out.print("\nWpisz index, ktory chcesz usunac: ");
                                    doRemove = scan.nextInt();

                                    // Check if index exists
                                    if (doRemove < 0 || doRemove >= doList.size()) {
                                        System.out.println("Nie ma takiego index'a!");
                                    } else {
                                        System.out.println("Sukces!");
                                        doList.remove(doRemove);
                                    }
                                }
                                break;

                            case '3': // DISPLAY ALL TASKS WITH STATUS
                                if(doList.isEmpty()) {
                                    System.out.println("Lista jest pusta!");
                                } else {
                                    System.out.println("\nCala lista: ");
                                    // Loop through parallel arrays: task and its status
                                    for (int i = 0; i < doList.size(); i++) {
                                        System.out.println(i + ". " + doList.get(i) + " [" + doStatus.get(i) + "]");
                                    }
                                }
                                break;

                            case '4': // CLEAR ENTIRE LIST
                                System.out.println("\nUsuniecie calej listy...");
                                doList.clear();
                                break;

                            case '5': // CHANGE STATUS OF EXISTING TASK
                                if(doList.isEmpty()) {
                                    System.out.println("Lista jest pusta!");
                                    break;
                                }

                                // Show all tasks first so user can see indexes
                                System.out.println("\nCala lista: ");
                                for (int i = 0; i < doList.size(); i++) {
                                    System.out.println(i + ". " + doList.get(i) + " [" + doStatus.get(i) + "]");
                                }

                                System.out.print("\nWpisz index, dla ktorego chcesz zmienic status: ");
                                doEditStatus = scan.nextInt();

                                // Validate index
                                if(doEditStatus < 0 || doEditStatus >= doList.size()) {
                                    System.out.println("Nie ma takiego index'a!");
                                } else {
                                    System.out.println("\nZaznacz status dla nazwy: " + doList.get(doEditStatus) + ": ");
                                    System.out.println("[1] - Dopiero dodany");
                                    System.out.println("[2] - W toku");
                                    System.out.println("[3] - Zakonczony");
                                    System.out.print("Wybierz: ");
                                    doChoiceStatus = scan.next().charAt(0);

                                    switch (doChoiceStatus) {
                                        case '1':
                                            doSetStatus = "dopiero dodany";
                                            break;
                                        case '2':
                                            doSetStatus = "w toku";
                                            break;
                                        case '3':
                                            doSetStatus = "zakonczony";
                                            break;
                                        default: {
                                            System.out.println("Cos poszlo nie tak!");
                                        }
                                    }

                                    // Update status in parallel array
                                    doStatus.set(doEditStatus, doSetStatus);
                                }
                                break;

                            case '6': // RETURN TO MAIN MENU
                                System.out.println("\nPowrot na glowna strone...");
                                break;

                            default: {
                                System.out.println("Cos poszlo nie tak!");
                            }
                        }
                    } while(doAction != '6'); // TODO menu loop
                    break;

                case '3': // QUICK ACCESS (not implemented yet)
                    System.out.println("W krotce zostanie zrealizowane!");
                    break;

                case '4': // EXIT PROGRAM
                    System.out.println("Wyjsice z programu...");
                    break;

                default: { // INVALID MAIN MENU OPTION
                    System.out.println("Cos nie tak wpisales!");
                }
            }
        } while(action != '4'); // Main application loop

    }
}