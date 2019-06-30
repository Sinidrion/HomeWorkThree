package com.company;

import java.util.Scanner;

public class Task5_64 {

    public static void main(String[] args) {
        float c = 0;
        float d = 0;
        for (int b = 1; b <= 12; b++) {
            System.out.println("Введите количество жителей в " + b + " районе(в тыс. человек)");
            Scanner num = new Scanner(System.in);
            float a = num.nextFloat();
            c += a;
        }
        for (int b = 1; b <= 12; b++) {
            System.out.println("Введите площадь " + b + " района(в кв.км)");
            Scanner num = new Scanner(System.in);
            float e = num.nextFloat();
            d += e;
        }
        float p = c/d;
        System.out.println("Плотность населения в области составляет " + p + " тыс. человек на кв.км");
    }
}
