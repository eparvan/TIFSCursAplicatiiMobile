package com.Lectia1.Problema1_11;
/*
* Scrieți un program Java care va afișa la ecran numerele naturale divizibile cu 37 și mai mici decât 400.
* */
public class Problema1_11 {
    public static void main(String[] args) {
        int numar=37;
        while(numar<400){
            if(numar % 37 ==0) System.out.print(numar+" ");
            numar+=37;
        }
    }
}
