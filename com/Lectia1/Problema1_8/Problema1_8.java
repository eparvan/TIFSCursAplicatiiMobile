package com.Lectia1.Problema1_8;
/*
 *Scrieți un program Java în care va fi declarat un masiv de numere naturale impare mai mici decât
 * 30 și care va afișa la ecran acest masiv.
 *
 */

public class Problema1_8 {
    public static void main(String[] args) {
        
        int[] masivImp=new int[15];
        int indice=0;
        for (int i=1;i<30;i+=2){
            masivImp[indice++]=i;
        }
        //Afisarea masivului cu numere impare
        for (int i:masivImp ) {
            System.out.print(i+" ");
        }

    }
}
