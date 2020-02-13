package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task01 {
    public static void main(String[] args) {
        double x=3, y=4;
        System.out.println("'x' is: " + x);
        System.out.println("'y' is: " + y);
        System.out.println("x+y=" + (x+y));
        System.out.println("x-y=" + (x-y));
        System.out.println("x*y=" + (x*y));
        if(y!=0) {
            System.out.println("x/y=" + (x / y));
        } else {
            System.out.println("x/y=udefined as we are not allowed to divide by 0 in ordinary arithmetic");
        }
    }
}
