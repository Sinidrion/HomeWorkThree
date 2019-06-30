package com.company;

public class Task5_12 {

    public static void main(String[] args) {
	int h = 0;
	float p0 = 1.29f;
	float z = 1.25e-4f;
	while (h<=1000){
	    System.out.println(h + "  " + p0*(float) Math.pow((float)Math.E,(-((float)(h))*z)));
	    h+=100;
    }
    }
}
