package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task09 {
    public static void main(String[] args) {
        double a=2, b=4, c=5, d=6, result;
        System.out.println("'a' is: " + a);
        System.out.println("'b' is: " + b);
        System.out.println("'c' is: " + c);
        System.out.println("'d' is: " + d);
        if((c == 0) || (d == 0)) {
            System.out.println("Result is undefined ('c' == 0 or 'd' == 0)");
        } else {
            // Arithmetic magic
            result = 1 / d;
            System.out.println("Result is: " + result);
        }
    }
}
