package com.company;

import java.util.Scanner;

public class Task5_38 {

    public static void main(String[] args) {
        int a = 2;
        float sum = 1;
        while (a<=100) {
           sum -=(float) 1/a;
           a++;
           sum += (float) 1/a;
           a++;
        }
        System.out.println("Расстояние до дома составляет " + sum + " км");
        int a1 = 1;
        float sum1 = 1;
        while (a1 <= 100) {
            sum1 += (float) 1 / a1;
            a1++;
        }
        System.out.println("Общий путь составил " + sum1 + " км");
    }
}
