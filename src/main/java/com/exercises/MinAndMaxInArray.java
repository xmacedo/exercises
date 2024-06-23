package com.exercises;

import java.util.Arrays;

// 1. Finding Minimum and Maximum Values in an Array
public class MinAndMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {5, 18, -3, 10, 0, 7};

        int min = numbers[0];
        int max = numbers[0];

        for (int a = 0; a < numbers.length; a++) {
            if (numbers[a] < min) {
                min = numbers[a];
            }
            if (numbers[a] > max) {
                max = numbers[a];
            }
        }
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Maxmimum: " + max);
        System.out.println("Minimum: " + min);
    }
}