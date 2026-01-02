package com.vadimush.learn.Lesson7_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson7_To_Do_List {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> doList = new ArrayList<>();

        char addAction = '0';
        char doAction = '0';
        int doRemove = 0;
        String doValue = "";
        String doAsk = "";

//        String doStatus = "None";

        do {
            System.out.println("\n[1] - Dodac index");
            System.out.println("[2] - Usunac index");
            System.out.println("[3] - Wyswietlic cala liste");
            System.out.println("[4] - Usunac cala liste");
            System.out.println("[5] - Powrot na glowna strone");

            System.out.print("\nWybierz akcje: ");
            doAction = scan.next().charAt(0);
            scan.nextLine();

            switch (doAction) {
                case '1':
                    System.out.print("Wpisz nazwe, java chcesz dodac: ");
                    doValue = scan.nextLine();
//                    System.out.println("Wpisz status dla nazwy: " + doValue + ": ");
//                    doStatus = scan.nextLine();

                    doList.add(doValue);

                    System.out.println("Sukces! Dodan index o nazwie: " + doValue + ".\n");


                    do {
                        System.out.println("[1] - Dodac jeszcze");
                        System.out.println("[2] - Powrot");
                        System.out.print("Wybierz akcje: ");
                        addAction = scan.nextLine().charAt(0);

                        switch (addAction) {
                            case '1':
                                System.out.print("Wpisz nazwe, java chcesz dodac: ");
                                doValue = scan.nextLine();

                                doList.add(doValue);

                                System.out.println("\nSukces! Dodan index o nazwie: " + doValue);
                                break;
                            case '2':
                                System.out.println("\nPowrot na glowna strone To-Do List...");
                                break;
                            default: {
                                System.out.println("Cos poszlo nie tak!");
                            }
                        }

                    } while (addAction != '2');
                    break;
                case '2':

                    if(doList.size() == 0) {
                        System.out.println("\nTy nie mozesz usunac index, poniewaz nie ma zadnego!");
                    } else {

                        System.out.print("\nWpisz index, ktory chcesz usunac: ");
                        doRemove = scan.nextInt();

                        doList.remove(doRemove);

                    }
                    break;
                case '3':
                    if(doList.size() == 0) {
                        System.out.println("Lista jest pusta!");
                    } else {
                        System.out.println("\nCala lista: ");
                        for (int i = 0; i < doList.size(); i++) {
                            System.out.println(i + ". " + doList.get(i));
                        }
                    }
                    break;
                case '4':
                    System.out.println("\nUsuniecie calej listy...");

                    doList.clear();
                    break;
                case '5':
                    System.out.println("\nPowrot na glowna strone...");
                    break;
                default: {
                    System.out.println("Cos poszlo nie tak!");
                }
            }
        } while(doAction != '5');
    }

}
