package com.Lectia1.Problema1_14;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/*
* Scrieți un program Java care va crea un masiv format din 20 de numere naturale aleatoriiși va afișa
la ecran elementele masivului ordonate descrescător.
* */
public class Problema1_14 {
    public static void main(String[] args) {
        Integer[] masiv = new Integer[20];
        Random el = new Random();
        for (int i=0;i<20; i++){
            masiv[i]=el.nextInt(100)+1;
        }
        //Masivul initial
        System.out.print("Masivul initial \n");

        for (int i=0; i<20; i++){
            System.out.print(masiv[i]+" ");
        }

        System.out.println("\nMasivul sortat descrescator");
        Arrays.sort(masiv, Collections.reverseOrder());
        for (int i=0; i<20; i++){
            System.out.print(masiv[i]+" ");
        }

    }
}
