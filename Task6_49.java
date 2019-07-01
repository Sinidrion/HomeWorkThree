package com.company;

import java.util.Scanner;

public class Task6_49 {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner num = new Scanner(System.in);
        int number = num.nextInt();
        int number1 = number;
        int number2 = number;
        //a)
        for (int c = number; number >= 00; number /= 10) {
            if (number % 10 == 3) {
                System.out.println("В числе есть 3");
                break;
            }
            if (number < 10 && number != 3) {
                System.out.println("В числе нет 3");
                break;
            }
        }
        //б))
        for (int c = number1; number1 >= 00; number1 /= 10) {
            if (number1 % 10 == 2) {
                System.out.println("В числе есть 2");
                break;
            }
            if (number1 < 10 && number1 != 2) {
                System.out.println("В числе нет 2");
                break;
            }
        }
        for (int c = number2; number2 >= 00; number2 /= 10) {
            if (number2 % 10 == 5) {
                System.out.println("В числе есть 5");
                break;
            }
            if (number2 < 10 && number2 != 5) {
                System.out.println("В числе нет 5");
                break;
            }
        }

    }
}
