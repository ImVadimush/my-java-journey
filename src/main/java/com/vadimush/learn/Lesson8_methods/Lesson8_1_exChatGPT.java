package com.vadimush.learn.Lesson8_methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson8_1_exChatGPT {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> doTaks = new ArrayList<>();

        doTaks.add("Learn Java");
        doTaks.add("Learn HTML");
        doTaks.add("Learn English");


        int userIndex;
        int size = doTaks.size();

        System.out.print("Wpisz index: ");
        userIndex = scan.nextInt();

        boolean isValid = isValidIndex(userIndex, size);

        if(isValid) {
            System.out.println("Sukces!");
            doTaks.remove(userIndex);
        } else {
            System.out.println("Nie ma takiego index'a!");
        }

    }

    public static boolean isValidIndex(int index, int size) {
        return index >= 0 && index < size;
    }
}
