package com.company;

import java.util.Scanner;

public class Task1_17 {

    public static void main(String[] args) {
        //а)
        System.out.println("Введите значение переменной x1");
        Scanner num = new Scanner(System.in);
        float x1a = num.nextFloat();
        System.out.println("Введите значение переменной x2");
        Scanner num1 = new Scanner(System.in);
        float x2a = num1.nextFloat();
        float resulta = (float)Math.sqrt((Math.pow(x1a,2)+Math.pow(x2a,2)));
        System.out.println("a)" + resulta);
        //б)
        System.out.println("Введите значение переменной x1");
        Scanner num2 = new Scanner(System.in);
        int x1b = num2.nextInt();
        System.out.println("Введите значение переменной x2");
        Scanner num3 = new Scanner(System.in);
        int x2b = num3.nextInt();
        System.out.println("Введите значение переменной x3");
        Scanner num4 = new Scanner(System.in);
        int x3b = num4.nextInt();
        int resultb = x1b*x2b + x1b*x3b + x2b*x3b;
        System.out.println("б)" + resultb);
        //в)
        System.out.println("Введите значение переменной v");
        Scanner num5 = new Scanner(System.in);
        int vv = num5.nextInt();
        System.out.println("Введите значение переменной a");
        Scanner num6 = new Scanner(System.in);
        float av = num6.nextFloat();
        System.out.println("Введите значение переменной t");
        Scanner num7 = new Scanner(System.in);
        float tv = num7.nextFloat();
        float resultv = (vv*tv) +(float)((av*Math.pow(tv,2)/2));
        System.out.println("в)" + resultv);
        //г)
        System.out.println("Введите значение переменной m");
        Scanner num8 = new Scanner(System.in);
        float mj = num8.nextFloat();
        System.out.println("Введите значение переменной v");
        Scanner num9 = new Scanner(System.in);
        float vj = num9.nextFloat();
        System.out.println("Введите значение переменной g");
        Scanner num10 = new Scanner(System.in);
        float gj = num10.nextFloat();
        System.out.println("Введите значение переменной h");
        Scanner num11 = new Scanner(System.in);
        float hj = num11.nextFloat();
        float resultj = (float)((mj*Math.pow(vj,2))/2)+(mj*gj*hj);
        System.out.println("г)" + resultj);
        //д)
        System.out.println("Введите значение переменной R1");
        Scanner num12 = new Scanner(System.in);
        float R1d = num12.nextFloat();
        System.out.println("Введите значение переменной R2");
        Scanner num13 = new Scanner(System.in);
        float R2d = num13.nextFloat();
        float resultd = (1/R1d)+(1/R2d);
        System.out.println("д)" + resultd);
        //е)
        System.out.println("Введите значение переменной m");
        Scanner num14 = new Scanner(System.in);
        float me = num14.nextFloat();
        System.out.println("Введите значение переменной g");
        Scanner num15 = new Scanner(System.in);
        float ge = num15.nextFloat();
        System.out.println("Введите значение переменной a");
        Scanner num16 = new Scanner(System.in);
        float ae = num16.nextFloat();
        float resulte = me*ge*(float)Math.cos(ae);
        System.out.println("e)" + resulte);
        //ж)
        System.out.println("Введите значение переменной R");
        Scanner num17 = new Scanner(System.in);
        float R = num17.nextFloat();
        float resultg = 2*(float)Math.PI*R;
        System.out.println("ж)" + resultg);
        //з)
        System.out.println("Введите значение переменной b");
        Scanner num18 = new Scanner(System.in);
        int bz = num18.nextInt();
        System.out.println("Введите значение переменной a");
        Scanner num19 = new Scanner(System.in);
        int az = num19.nextInt();
        System.out.println("Введите значение переменной c");
        Scanner num20 = new Scanner(System.in);
        int cz = num20.nextInt();
        int resultz = (int)(Math.pow(bz,2))-(4*az*cz);
        System.out.println("з)" + resultz);
        //и)
        System.out.println("Введите значение переменной y");
        Scanner num21 = new Scanner(System.in);
        float yi = num21.nextFloat();
        System.out.println("Введите значение переменной m1");
        Scanner num22 = new Scanner(System.in);
        float m1i = num22.nextFloat();
        System.out.println("Введите значение переменной m2");
        Scanner num23 = new Scanner(System.in);
        float m2i = num23.nextFloat();
        System.out.println("Введите значение переменной r");
        Scanner num24 = new Scanner(System.in);
        float ri = num24.nextFloat();
        float resulti = yi*((m1i*m2i)/(float) Math.pow(ri,2));
        System.out.println("и)" + resulti);
        //к)
        System.out.println("Введите значение переменной I");
        Scanner num25 = new Scanner(System.in);
        int Ik = num25.nextInt();
        System.out.println("Введите значение переменной R");
        Scanner num26 = new Scanner(System.in);
        int Rk = num26.nextInt();
        int resultk = (int)Math.pow(Ik,2)*Rk;
        System.out.println("к)" + resultk);
        //л)
        System.out.println("Введите значение переменной a");
        Scanner num27 = new Scanner(System.in);
        float al = num27.nextFloat();
        System.out.println("Введите значение переменной b");
        Scanner num28 = new Scanner(System.in);
        float bl = num28.nextFloat();
        System.out.println("Введите значение переменной c");
        Scanner num29 = new Scanner(System.in);
        float cl = num29.nextFloat();
        float resultl = al * bl * (float)Math.sin(cl);
        System.out.println("л)" + resultl);
        //м)
        System.out.println("Введите значение переменной a");
        Scanner num30 = new Scanner(System.in);
        float am = num30.nextFloat();
        System.out.println("Введите значение переменной b");
        Scanner num31 = new Scanner(System.in);
        float bm = num31.nextFloat();
        System.out.println("Введите значение переменной c");
        Scanner num32 = new Scanner(System.in);
        float cm = num32.nextFloat();
        float resultm = (float)Math.sqrt((float)Math.pow(am,2)+(float) Math.pow(bm,2)-(2*am*bm*(float)Math.cos(cm)));
        System.out.println("м)" + resultm);
        //н)
        System.out.println("Введите значение переменной a");
        Scanner num33 = new Scanner(System.in);
        float an = num33.nextFloat();
        System.out.println("Введите значение переменной b");
        Scanner num34 = new Scanner(System.in);
        float bn = num34.nextFloat();
        System.out.println("Введите значение переменной c");
        Scanner num35 = new Scanner(System.in);
        float cn = num35.nextFloat();
        System.out.println("Введите значение переменной d");
        Scanner num36 = new Scanner(System.in);
        float dn = num36.nextFloat();
        float resultn = ((an*dn)+(bn*cn))/(an*dn);
        System.out.println("н)" + resultn);
        //о)
        System.out.println("Введите значение переменной x");
        Scanner num37 = new Scanner(System.in);
        float xo = num37.nextFloat();
        float resulto = (float)Math.sqrt(1-(float)Math.pow((float)Math.sin(xo),2));
        System.out.println("о)" + resulto);
        //п)
        System.out.println("Введите значение переменной a");
        Scanner num38 = new Scanner(System.in);
        float ap = num38.nextFloat();
        System.out.println("Введите значение переменной b");
        Scanner num39 = new Scanner(System.in);
        float bp = num39.nextFloat();
        System.out.println("Введите значение переменной c");
        Scanner num40 = new Scanner(System.in);
        float cp = num40.nextFloat();
        System.out.println("Введите значение переменной x");
        Scanner num41 = new Scanner(System.in);
        float xp = num41.nextFloat();
        float resultp = 1/(float)Math.sqrt(ap*Math.pow(xp,2)+bp*xp+cp);
        System.out.println("п)" + resultp);
        //р
        System.out.println("Введите значение переменной x");
        Scanner num42 = new Scanner(System.in);
        float xr = num42.nextFloat();
        float resultr = ((float)Math.sqrt(xr+1)+(float)Math.sqrt(xr-1))/(2*(float)Math.sqrt(xr));
        System.out.println("р)" + resultr);
        //с)
        System.out.println("Введите значение переменной x");
        Scanner num43 = new Scanner(System.in);
        int xs = num43.nextInt();
        int results = Math.abs(xs)+Math.abs(xs+1);
        System.out.println("с)" + results);
        //т)
        System.out.println("Введите значение переменной x");
        Scanner num44 = new Scanner(System.in);
        int xt = num44.nextInt();
        int resultt = Math.abs(1-Math.abs(xt));
        System.out.println("т)" + resultt);


    }
}
