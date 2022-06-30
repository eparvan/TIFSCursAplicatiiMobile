package com.Lectia1.Problema1_10;
/*
* Scrieți un program Java care va calcula produsul numerelor impare mai mici decât 30.
* */
public class Problema10 {
    public static void main(String[] args) {
        long produsImpare=1;
        for(int i=1; i<30; i+=2){
            produsImpare*=i;
        }
        System.out.println(produsImpare);
    }
}
