package com.company;

import java.util.Scanner;

public class Task5_71 {

    public static void main(String[] args) {
        int sum=1000;
        for (int b = 1; b <= 10; b++) {
            int prirost = (sum*2/100);
            sum += prirost;
            System.out.println("Прирост суммы за " + b + " месяц составил " + prirost + " рублей");
        }
        int sum1=1000;
        for (int b = 3; b <= 12; b++) {
            int prirost = sum1 * 2 / 100;
            sum1 += prirost;
            System.out.println("Сумма за " + b + " месяц составляет " + sum1 + " рублей");
        }
    }
}