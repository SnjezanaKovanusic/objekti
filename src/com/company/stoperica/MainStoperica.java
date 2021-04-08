package com.company.stoperica;

public class MainStoperica {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch();
        int[] niz= SortRandomNumber.generisi();


        stopwatch.start();

       // SortRandomNumber.sortiraj(niz);
        Thread.sleep(500);

        stopwatch.stop();

        stopwatch.getElapsedTime();

    }
}
