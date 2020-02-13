package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task12 {
    public static void main(String[] args) {
        double x1=0, y1=0, x2=3, y2=4, dx, dy, distance;
        dx = x1 - x2;
        dy = y1 - y2;
        distance = Math.sqrt(dx * dx + dy * dy);
        System.out.println("Distance between points A(" + x1  + "," + y1 + ") and B(" + x2  + "," + y2 + ") is: " + distance);
    }
}
