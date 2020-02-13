package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task15 {
    public static void main(String[] args) {
        double powerPI=1;
        System.out.println("\u03C0  is: " + (powerPI*=Math.PI));
        System.out.println("\u03C0\u00B2 is: " + (powerPI*=Math.PI));
        System.out.println("\u03C0\u00B3 is: " + (powerPI*=Math.PI));
        System.out.println("\u03C0\u2074 is: " + (powerPI*=Math.PI));
    }
}
