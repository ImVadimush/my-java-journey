package com.vadimush.learn.Lesson8_methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson8_2_To_Do_List {
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

        boolean isAuthorized = false;

        // LOGIN LOOP
        do {
            printLogo();

            System.out.print("Wpisz login: ");
            login = scan.nextLine();

            System.out.print("Wpisz haslo: ");
            password = scan.nextLine();

            // Hardcoded authentication (admin/123)
            if (login.equals("admin") && password.equals("123")) {
                isAuthorized = true;
            }
        } while (!isAuthorized);

        // MAIN APPLICATION LOOP
        do {
            printLogo();

            System.out.println("[1] - Kalkulator");
            System.out.println("[2] - To-Do list");
            System.out.println("[3] - Szybki dostep");
            System.out.println("[4] - exit");

            System.out.print("\nWybierz akcje: ");
            action = scan.next().charAt(0);

            switch (action) {
                case '1':  {
                    calculator(scan);
                    break;
                }
                case '2': {
                    toDoList(scan, doList, doStatus);
                    break;
                }
                case '3': {
                    System.out.println("Jeszcze nie ma tej funkcji!");
                    break;
                }
                case '4': {
                    System.out.println("Wyjscie z programu...");
                    return;
                }
            }

        } while (isAuthorized);
    }

    public static void printLogo() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n" +
                "  ___        _   _               _   _           _             \n" +
                " / _ \\ _   _| |_| |__   ___ _ __ | |_(_) ___ __ _| |_ ___  _ __ \n" +
                "| | | | | | | __| '_ \\ / _ \\ '_ \\| __| |/ __/ _` | __/ _ \\| '__|\n" +
                "| |_| | |_| | |_| | | |  __/ | | | |_| | (_| (_| | || (_) | |   \n" +
                " \\___/ \\__,_|\\__|_| |_|\\___|_| |_|\\__|_|\\___\\__,_|\\__\\___/|_|   \n" +
                "     version: 1.2.0             |           by VadimuIII" +
                "\n");
    }

    public static void calculator(Scanner scan) {
        char action = '0';

        System.out.println("\n\n\n\n\n\n\n\n\nJestes w kalkulatorze!\n");

        do {
            System.out.print("Wpisz liczbe 1: ");
            int num1 = scan.nextInt();
            scan.nextLine();

            System.out.print("Wpisz liczbe 2: ");
            int num2 = scan.nextInt();
            scan.nextLine();

            System.out.print("Podaj akcje (+, -, *, /, %): ");
            char function = scan.next().charAt(0);
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
                        break;
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
                    break;
                }
            }
            System.out.println("\n[1] - Chce policzyc jeszcze raz");
            System.out.println("[2] - Powroc do glownego menu");

            System.out.print("Wybierz akcje: ");
            action = scan.next().charAt(0);
        } while (action != '2') ;

    }

    public static String printChoiceStatus(Scanner scan) {

        char doChoiceStatus = '0';
        String doSetStatus = "";

        System.out.println("\nZaznacz status: ");
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

        return doSetStatus;
    }

    public static void toDoList(Scanner scan, ArrayList<String> doList, ArrayList<String> doStatus) {

        // TODO list variables
        char addAction;
        char doAction;
        int doRemove;
        String doValue;

        // Status change variables
        int doEditStatus;
        String doSetStatus = "";

        do {
            // TODO list sub-menu options
            System.out.println("\n[1] - Dodac index");
            System.out.println("[2] - Usunac index");
            System.out.println("[3] - Wyswietlic cala liste");
            System.out.println("[4] - Usunac cala liste");
            System.out.println("[5] - Zmienic status");
            System.out.println("[6] - Powrot na glowna strone");

            System.out.print("\nWybierz akcje: ");
            doAction = scan.next().charAt(0);
            scan.nextLine();

            switch (doAction) {
                case '1': // ADD TASK
                    System.out.print("Wpisz nazwe, ktora chcesz dodac: ");
                    doValue = scan.nextLine();
                    doList.add(doValue);

                    doSetStatus = printChoiceStatus(scan);

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

                                doSetStatus = printChoiceStatus(scan);

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
                            doStatus.remove(doRemove);
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
                        doSetStatus = printChoiceStatus(scan);

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

    }

}
