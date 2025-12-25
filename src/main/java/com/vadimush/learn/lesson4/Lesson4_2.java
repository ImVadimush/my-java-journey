package com.vadimush.learn.lesson4;

import java.util.Scanner;

public class Lesson4_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Wpisz swoja role: ");
        String role = scan.nextLine();

        System.out.print("Wpisz haslo: ");
        String password = scan.nextLine();

        if(role.equalsIgnoreCase("admin") && password.equalsIgnoreCase("04212009Vadim228")) {
            System.out.print("Masz dostep do admina!");
        } else {
            System.out.println("Cos podales nie tak!");
        }
    }
}