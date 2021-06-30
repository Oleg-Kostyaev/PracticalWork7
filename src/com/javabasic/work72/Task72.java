package com.javabasic.work72;

import java.util.Arrays;

public class Task72 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        int sum = sumOddElementsArray(array);
//        int sum = sumOddElementsArray(null);
//        int sum = sumOddElementsArray(new int[] {});
//        int sum = sumOddElementsArray(new int[] {2, 4, 6, 8, 10});
        System.out.println(sum);
    }

    public static int sumOddElementsArray(int[] array) {
        if (array == null) {
            return -1;
        }
        int sum = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                sum += element;
            }
        }
        return sum;
    }

    public static int[] createArray() {
        int[] array = new int[23];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        return array;
    }
}