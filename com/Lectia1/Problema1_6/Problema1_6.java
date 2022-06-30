package com.Lectia1.Problema1_6;

/*
* Programul va afisa cel mai mare divizor comun dintre doua numere
* */
public class Problema1_6 {
    public static void main(String[] args) {

        int a = 468;
        int b = 432;
        int d = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                d = i;
            }
        }
        System.out.println(d);
    }
}
