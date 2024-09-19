package com.arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array) {
            sum += num; // Add each element to sum
        }

        System.out.println("Sum: " + sum);
    }
}
