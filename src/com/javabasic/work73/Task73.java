package com.javabasic.work73;

import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        int size = getSizeMatrix();
        int[][] matrix = createMatrix(size);
        printMatrix(matrix);
    }

    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][0] = value;
            for (int j = 1; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j-1] + size;
            }
            value++;

        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] oneArray : matrix) {
            for (int elem : oneArray) {
                System.out.printf("%3d", elem);
            }
            System.out.println();
        }
    }

    public static int getSizeMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size matrix -> ");
        while (true) {
            if (!scanner.hasNextInt()) {
                scanner.next();
            } else {
                int number = scanner.nextInt();
                if (number > 1 && number < 10) {
                    return number;
                }
            }
            System.out.println("Invalid value! Repeat!");
        }
    }
}
