package com.Lectia1.Problema1_2;

public class Problema1_2 {

    /*
     * . Fie punctele A(–10, 16) și B(14, – 8).
     * Scrieți un program Java care va afișa lungimea segmentului AB
     * și coordonatele mijlocului segmentului AB.
     * */
    public static void main(String[] args) {
        Point A = new Point();
        Point B = new Point();
        A.x = -10;
        A.y = 16;
        B.x = 14;
        B.y = -8;
        double lungimeAB = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));

        System.out.println("Lungimea AB = " + lungimeAB);

        //Mijlocul segmentului AB
        Point M = new Point();
        M.x = (A.x + B.x) / 2;
        M.y = (A.y + B.y) / 2;
        System.out.println("Mijlocul segmentului AB = (" + M.x + ", " + M.y + ")");
    }
}
