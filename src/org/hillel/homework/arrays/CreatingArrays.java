package org.hillel.homework.arrays;

import java.util.Random;

public class CreatingArrays {
    public static void main(String[] args) {
         /*- создать два массива array1, array2 размером [10][20]
          - заполнить эти массивы случайными значениями от 0 до 100
          - перемножить значение елементов массива array1 на array2, результат сохранить в массив array3*/

        int firstSize = 10;
        int secondSize = 20;

        int minValue = 0;
        int maxValue = 100;

        int[][] firstFactor = new int[firstSize][secondSize];
        int[][] secondFactor = new int[firstSize][secondSize];
        int[][] multiplication = new int[firstSize][secondSize];

        Random random = new Random();
        Methods.arrayFill(random, firstFactor, secondFactor, multiplication, minValue, maxValue);
        Methods.printArray(firstFactor, "first array (multiplier)");
        Methods.printArray(secondFactor, "second array (multiplier)");
        Methods.printArray(multiplication, "third array (result of multiplication)");

    }
}
