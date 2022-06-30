package com.Lectia1.Problema1_7;
/*
* Cel mai mic multiplu comun: a*b/cmmdc(a,b)
* */
public class Problema1_7 {
    public static void main(String[] args) {
        int a = 468;
        int b = 432;
        int d = 1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                d = i;
            }
        }
        int cmmmc=(a*b)/d;
        System.out.println("cmmmc( "+a+","+b+" )="+cmmmc);
    }
}
