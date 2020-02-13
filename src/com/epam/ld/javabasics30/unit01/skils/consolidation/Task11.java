package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task11 {
    public static void main(String[] args) {
        double a=3, b=4, c, p, s;
        c = Math.sqrt(a*a+b*b);
        p = a + b + c;
        s = 0.5*a*b;
        System.out.println("Cathetus 'a' is: " + a);
        System.out.println("Cathetus 'b' is: " + b);
        System.out.println("Perimeter of a right triangle 'p' is: " + p);
        System.out.println("Area of a right triangle 's' is: " + s);
    }
}
