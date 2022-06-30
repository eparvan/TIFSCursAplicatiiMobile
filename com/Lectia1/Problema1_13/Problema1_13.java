package com.Lectia1.Problema1_13;

import java.util.Random;

/*
* 13. Scrieți un program Java care va crea un masiv format din 20 de numere naturale aleatorii și va afișa
la ecran pozițiile în care apare valoarea maximală din masiv.
* */
public class Problema1_13 {
    public static void main(String[] args) {
        int[] masiv = new int[20];
        Random el = new Random();
        for (int i=0;i<20; i++){
            masiv[i]=el.nextInt(100)+1;
        }
        //Masivul initial
        System.out.print("Masivul initial \n");
        int max=masiv[0];

        for (int i=0; i<20; i++){
            System.out.print(masiv[i]+" ");
            if (max<masiv[i]) {max=masiv[i]; }
        }
        System.out.println("\nElementul maximal din masivul este: "+ max);
        System.out.println("Pozitiile elementelor maximale:");
        for (int i=0; i<20; i++){
            if (max==masiv[i])
                System.out.print(i+" ");
        }
    }
}
