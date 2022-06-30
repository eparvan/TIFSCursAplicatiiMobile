package com.Lectia1.Problema1_15;
//si problema 16
public class Problema1_15 {
    public static void main(String[] args) {
        long n = 2048*2048;
        //16^5=2^20=2048*2048, va afisa: DA
        int i = 1;
        while (i < n) { i *= 2;}
        System.out.println((i == n) ? "DA" : "NU");
    }
}
