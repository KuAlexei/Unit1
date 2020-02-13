package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task06 {
    public static void main(String[] args) {
        double milkSmallVolume=80, n=2, m=4, milkBigVolume;
        milkBigVolume = (milkSmallVolume/n + 12) * m;
        System.out.println("'n' is: " + n);
        System.out.println("'m' is: " + m);
        System.out.println("В больших бидонах всего: " + milkBigVolume + " л.");
    }
}
