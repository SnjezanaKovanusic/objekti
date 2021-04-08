package com.company.stoperica;

import java.util.Arrays;
import java.util.Random;

public class SortRandomNumber {

    public static int[] generisi() {
        Random random = new Random();
        int[] niz = new int[100000];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = random.nextInt(1000);
        }
        return niz;
    }

    public static void ispisi(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            System.out.println("niz = " + niz[i]);
        }
    }

    public static void sortiraj(int[] niz) {
        System.out.println("Sortiranje pocetak sortiranja");
        sortiranjeNiza(niz);
        ispisi(niz);
        System.out.println("Sortiranje zavrsetak");
    }


    public static void sortiranjeNiza(int[] niz) {
        for (int i = 0; i < niz.length; i++) {
            for (int j = i; j < niz.length; j++) {
                if (niz[i] > niz[j]) {
                    int privremenaVar = niz[i];
                    niz[i] = niz[j];
                    niz[j] = privremenaVar;
                }
            }
        }

    }


}
