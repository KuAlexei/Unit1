package com.epam.ld.javabasics30.unit01.skils.consolidation;

public class Task13 {
    public static void main(String[] args) {
        double x1=0, y1=0, x2=3, y2=0, x3=3, y3=4, dx, dy, a, b, c, p, s;
        dx = x1 - x2;
        dy = y1 - y2;
        a = Math.sqrt(dx * dx + dy * dy);
        dx = x2 - x3;
        dy = y2 - y3;
        b = Math.sqrt(dx * dx + dy * dy);
        s = dy;
        dy = y1 - y3;
        s = s * (x1 - x3) - dx * dy;
        dx = x1 - x3;
        c = Math.sqrt(dx * dx + dy * dy);
        p = a + b + c;
        s = Math.abs(s)/2;
        System.out.println("A(" + x1  + "," + y1 + "), B(" + x2  + "," + y2 + ") and C(" + x3  + "," + y3 + ")");
        System.out.println("Perimeter of a right triangle 'p' is: " + p);
        System.out.println("Area of a right triangle 's' is: " + s);
    }
}
