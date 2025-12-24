package com.vadimush.learn;

// import Scanner from utils
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        // Create object and allocate memory
        Scanner scan = new Scanner(System.in);

        // Get input from the user
        System.out.print("Print number 1: ");
        float num1 = scan.nextFloat();

        System.out.print("Print number 2: ");
        float num2 = scan.nextFloat();

        // Lite denunciation
        float result_plus = num1 + num2;
        float result_minus = num1 - num2;
        float result_multiplication = num1 * num2;
        float result_division = num1 / num2;
        float result_divi_remainder = num1 % num2;

        // Print result
        System.out.println(num1 + " + " + num2 + " = " + result_plus);
        System.out.println(num1 + " - " + num2 + " = " + result_minus);
        System.out.println(num1 + " * " + num2 + " = " + result_division);
        System.out.println(num1 + " / " + num2 + " = " + result_multiplication);
        System.out.println(num1 + " / " + num2 + " = " + result_divi_remainder);

    }
}

/*
Несколько основных методов ввода данных в Java:

1. nextLine()  - для ввода строки. Возвращаемый тип данных: String.
2. nextInt()   - для ввода целых чисел. Возвращаемый тип данных: int.
3. nextFloat() - для ввода чисел с плавающей точкой (float). Возвращаемый тип данных: float.
4. nextDouble()- для ввода чисел с плавающей точкой (double). Возвращаемый тип данных: double.

Математические операции в Java:

- Вычитание: z = y - x;
- Сложение:  z = y + x;
- Умножение: z = y * x;
- Деление:   z = y / x;   // на ноль делить нельзя
- Остаток от деления: z = y % x;
*/