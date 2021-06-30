package com.javabasic.work75;

import java.util.Arrays;
import java.util.Scanner;

public class Task75 {
    public static void main(String[] args) {
        String strNumber = getStrNumber();
        int[] numbers = countOfSequenceNumbers(strNumber);
        System.out.println(Arrays.toString(numbers));
    }
    public static String getStrNumber(){
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("Enter string of numbers [0-9] ->");
            str = sc.next();
        } while (!str.matches("^[0-9]+"));

        return str;
    }
    public static int[] countOfSequenceNumbers(String numbers){
        int[] digits = new int[10];
        String strTemp = "0123456789";
        for (int i = 0; i < numbers.length(); i++) {
            char ch = numbers.charAt(i);
            digits[strTemp.indexOf(ch)]++;
        }
        return digits;
    }
}
