package com.company;


import objectives.StopWatch_9_06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StopWatch_9_06 stopwatch = new StopWatch_9_06();
        int[] randomArray = getArray();
        stopwatch.setStartTime();
        selectionSort(randomArray);
        stopwatch.setEndTime();
        System.out.println("The execution time of sorting 100,000 " +
                "numbers using selection sort: " + stopwatch.getElipsedTime() +
                " milliseconds");
    }
    public static int[] getArray() {
        // Create an array of length 100,000
        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100000);
        }
        return array;
    }
    public static void selectionSort(int[] array) {
        Arrays.sort(array);
        /*for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                array[minIndex] = array[i];
                array[i] = min;
            }
        }*/
    }
}
