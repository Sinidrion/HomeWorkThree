package com.company;

import java.util.Scanner;

public class Task5_3 {

    public static void main(String[] args) {
        //a)
        int i = 20;
        while (i<=35) {
            System.out.println(i);
            i++;
        }
        //б)
        int a =10;
        System.out.println("Введите значение b, b>=10");
        Scanner num = new Scanner(System.in);
        int b = num.nextInt();
        while (a<=b){
            System.out.println((int)Math.pow(a,2));
            a++;
        }
        //в)
        int bv = 50;
        System.out.println("Введите значение a, a<=50");
        Scanner num1 = new Scanner(System.in);
        int av = num1.nextInt();
        while (av<=bv){
            System.out.println((int)Math.pow(av,3));
            av++;
        }
        //г)
        System.out.println("Введите значение a");
        Scanner num2 = new Scanner(System.in);
        int aj = num2.nextInt();
        System.out.println("Введите значение b, b>=a");
        Scanner num3 = new Scanner(System.in);
        int bj = num3.nextInt();
        while (bj>=aj){
            System.out.println(aj);
            aj++;
        }

    }
}
