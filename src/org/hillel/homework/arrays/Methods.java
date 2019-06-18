package org.hillel.homework.arrays;

import java.util.Arrays;
import java.util.Random;

public class Methods {

    public static void arrayFill(Random random, int[][] firstArrayFactor, int[][] secondArrayFactor, int[][] multiplicationResult, int minValue, int maxValue) {
        for (int i = 0; i < firstArrayFactor.length; i++) {
            for (int j = 0; j < firstArrayFactor[i].length; j++) {
                firstArrayFactor[i][j] = (createRandomNumber(random, minValue, maxValue));
                secondArrayFactor[i][j] =(createRandomNumber(random, minValue, maxValue));
                multiplicationResult[i][j] = firstArrayFactor[i][j] * secondArrayFactor[i][j];
            }
        }
    }

    public static int createRandomNumber(Random randomGenerator, int minValue, int maxValue) {
        if (randomGenerator == null) {
            return 0;
        }
        return (int) (Math.random() * (maxValue - minValue) + minValue);
    }

    public static void printArray(int[][] array, String arrayName){
        System.out.printf("\r\nWe printed %s \r\n", arrayName);
        System.out.println("\r\n" + Arrays.deepToString(array).replace("], ", "]\n"));
    }

}
