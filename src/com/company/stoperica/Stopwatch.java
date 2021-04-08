package com.company.stoperica;

public class Stopwatch {
/*    9.6 (Stopwatch) Design a class named StopWatch. The class contains:
            ■ Private data fields startTime and endTime with getter methods.
 ■ A no-arg constructor that initializes startTime with the current time.
 ■ A method named start() that resets the startTime to the current time.
            ■ A method named stop() that sets the endTime to the current time.
            ■ A method named getElapsedTime() that returns the elapsed time for the
    stopwatch in milliseconds.
    Draw the UML diagram for the class and then implement the class. Write a test
    program that measures the execution time of sorting 100,000 numbers using
    selection sort.
    */

    private long startTime;
    private long endTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
        System.out.println("Pocetno vrjeme iz konstruktora = " + startTime);
    }

    public void start() {
        startTime = System.currentTimeMillis();
        System.out.println("Startali stopericu");
    }

    public void stop() {
        endTime = System.currentTimeMillis();
        System.out.println("zaustavili stopericu");

    }

    public long getElapsedTime() {
        long protekloVremena = endTime - startTime;
        System.out.println("Proteklo vremena prilikom sortiranja = " + protekloVremena);
        return protekloVremena;

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
