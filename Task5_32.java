package com.company;

import java.util.Scanner;

public class Task5_32 {

    public static void main(String[] args) {
        int a = 2;
        System.out.println("Задайте число n,n>=1");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        float sum = 1;
        while(a<=n){
            sum += (float) 1/a;
            a++;
        }
            System.out.println(sum);
    }
}
