package com.company;

import java.util.Scanner;

public class Task5_51 {

    public static void main(String[] args) {
        System.out.println("Введите ватуральное число n");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int c = 0;
        for (int b=1;b<=n;b++){
            System.out.println("Введите вещевственное число a"+b);
            Scanner num1 = new Scanner(System.in);
            int a = num1.nextInt();
            c += a;
        }
        System.out.println("Среднее арифметическое:" + c/n);

    }
}
