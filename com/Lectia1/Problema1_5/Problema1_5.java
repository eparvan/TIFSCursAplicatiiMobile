package com.Lectia1.Problema1_5;
/*
* Scrieți un program Java care va calcula și va afișa la ecran suma cifrelor numărului 2143678.
*
* */
public class Problema1_5 {
    public static void main(String[] args) {
        int numar=2143678;
        int suma=0;

        while (numar !=0){
            suma+=numar%10;
            numar/=10;
        }
        System.out.println("suma = " +suma);
    }
}
