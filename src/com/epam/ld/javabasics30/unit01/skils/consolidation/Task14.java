package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task14 {
    public static void main(String[] args) {
        double r=3, l, s;
        System.out.println("Radius 'r' is: " + r);
        if(r < 0) {
            System.out.println("Radius < 0");
        } else {
            l = 2 * r * Math.PI;
            s = r * r * Math.PI;
            System.out.println("Length of circumference is: " + l);
            System.out.println("Area of a circle is: " + s);
        }
    }
}
