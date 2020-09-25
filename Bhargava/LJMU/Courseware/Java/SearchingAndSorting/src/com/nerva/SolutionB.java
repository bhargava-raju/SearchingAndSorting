package com.nerva;

import java.util.Scanner;
//https://stackoverflow.com/questions/16513429/binary-search-on-unknown-size-array

public class SolutionB {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Length of the array
        int m = input.nextInt(); // M - element in search.
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int index = elementIndex(m, numbers);
        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println("NOT_FOUND");
        }
    }

    private static int elementIndex(int m, int[] numbers) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if( numbers[i] == m) index = i+1;
        }
        return index;
    }

}
