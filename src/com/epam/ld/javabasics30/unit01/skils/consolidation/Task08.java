package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task08 {
    public static void main(String[] args) {
        double a=2, b=4, c=5, bb, ac, underRoot, result;
        System.out.println("'a' is: " + a);
        System.out.println("'b' is: " + b);
        System.out.println("'c' is: " + c);
        ac = a*c;
        bb = b*b;
        underRoot = bb + 4 * ac;
        if((a == 0) || (b == 0) || (underRoot < 0)) {
            System.out.println("Result is undefined ('a' == 0 or 'b' == 0 or 'b\u00B2+4ac' < 0)");
        } else {
            result = (b + Math.sqrt(underRoot)) / (2 * a) - a * a * ac + 1/bb;
            System.out.println("Result is: " + result);
        }
    }
}
