package com.javabasic.work71;

import java.util.Arrays;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        int size = getSizeArray();
        int[] arrayInt = createArray(size);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] createArray(int size) {
        int[] arrInt = new int[size];
        int value = 2;
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = value;
            value += 2;
        }
        return arrInt;
    }

    public static int getSizeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size array -> ");
        while (true) {
            if (!scanner.hasNextInt()) {
                scanner.next();
            } else {
                int number = scanner.nextInt();
                if (number > 0) {
                    return number;
                }
            }
            System.out.println("Invalid value! Repeat!");
        }
    }

}