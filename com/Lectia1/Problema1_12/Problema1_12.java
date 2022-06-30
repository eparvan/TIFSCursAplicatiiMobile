package com.Lectia1.Problema1_12;

import java.util.Arrays;
import java.util.Random;

/*
* Scrieți un program Java care va crea un masiv format din 20 de numere naturale aleatorii și va afișa
* la ecran valorile minime din masiv. Indicație. Utilizați funcția Math.random().
* */
public class Problema1_12 {
    public static void main(String[] args) {
        int[] masiv = new int[20];
        Random el = new Random();
        for (int i=0;i<20; i++){
            masiv[i]=el.nextInt(100)+1;
        }
        //Masivul initial
        System.out.print("Masivul initial \n");
        int min=masiv[0];
        for (int i=0; i<20; i++){
            System.out.print(masiv[i]+" ");
            if (min>masiv[i]) min=masiv[i];
        }
        System.out.print("\nElementele minime din masivul initial \n");
        for (int i=0; i<20; i++){
            if (min==masiv[i])
                System.out.print(masiv[i]+" ");
        }

    }
}
