package com.Lectia1.Problema1_9;
/*
* Scrieți un program Java care va calcula suma numerelor naturale pare mai mici decât 200.
* */
public class Problema1_9 {
    public static void main(String[] args) {
        int sumaPare=0;
        for (int i=2; i<200; i+=2){
            sumaPare+=i;
        }
        System.out.println("sumaPare= "+sumaPare);
    }
}
