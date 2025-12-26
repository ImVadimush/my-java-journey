package com.vadimush.learn;

public class Lesson2_data_types {

    public static void main(String[] args) {

        // My example
        byte age = 16;
        float biceps = 41.3f;
        String name = "Vadym";
        boolean isHappy = true;
        String gender = "male";

        System.out.println("Age: " + age + "\nYour biceps: " + biceps + "cm" + "\nYour Name: " + name + "\nHappy? " + isHappy + "\nYout gender: " + gender);

    }
}

/*
   - Целые числа (integer types)
	byte	- Диапазон чисел от -128 до 127;
	short	- Диапазон чисел от -32768 до 32767;
	int		- Диапазон чисел от -2147483648 до 2147483647;
	long	- Диапазон чисел от -9 223 372 036 854 775 808 до 9 223 372 036 854 775 807;

	- Числа с плавающей точкой (floating-point types)
	float	- Для создания чисел с плавающей точкой. Диапазон: ±3.4*10^38;
	double	- Для создания чисел с плавающей точкой. Диапазон: ±4.9*10^-324 … ±1.8*10^308;

	- Прочие типы данных
	boolean	- Логический тип данных. Может хранить true или false;
	char	- Тип данных для символов. Один символ в одинарных кавычках, например 'A';
	String	- Тип данных для текста. Можно хранить слова и предложения в двойных кавычках, например "Hello World!".
*/