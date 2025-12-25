package com.vadimush.learn.lesson4;

import java.util.Scanner;

public class Lesson4_practice1 {

    public static void main(String[] args) {
        /*
    Ввести номер месяца:

    1,3,5,7,8,10,12 → 31 день
    4,6,9,11 → 30 дней
    2 → 28 дней
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Wpisz liczbe miesiaca");
        byte num_month = scan.nextByte();

        if (num_month == 1 || num_month == 3 || num_month == 5 || num_month == 7 || num_month == 10 || num_month == 12) {
            System.out.print("31 день");
        } else if (num_month == 4 || num_month == 6 || num_month == 9 || num_month == 11) {
            System.out.print("30 дней");
        } else if (num_month == 2) {
            System.out.print("28 дней");
        } else {
            System.out.print("Cos poszlo nie tak");
        }
    }
}
