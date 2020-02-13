package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task10 {
    public static void main(String[] args) {
        double x=1, y=4, denominator, xy, result;
        denominator = Math.cos(x) - Math.sin(y);
        System.out.println("'x' is: " + x);
        System.out.println("'y' is: " + y);
        if(denominator == 0) {
            System.out.println("Result is undefined, denominator 'cos(x) - sin(y)' is equal to 0");
        } else {
            xy = x * y;
            if(Math.abs(xy % Math.PI) == Math.PI/2) {
                System.out.println("Result is infinite, 'tg(x*y)' is infinite");
            } else {
                result = (Math.sin(x) + Math.cos(y)) / denominator * Math.tan(xy);
                System.out.println("Result is: " + result);
            }
        }
    }
}
