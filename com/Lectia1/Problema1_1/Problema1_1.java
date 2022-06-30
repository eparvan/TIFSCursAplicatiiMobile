package com.Lectia1.Problema1_1;

public class Problema1_1 {
    public static void main(String[] args) {
        int numar=12345;
        int ct=numar/9;
        int rest=numar%9;

        System.out.printf("%d / %d = %d\n",numar,9,ct);
        System.out.printf("%d %c %d = %d\n",numar,'%',9,rest);
    }
}
