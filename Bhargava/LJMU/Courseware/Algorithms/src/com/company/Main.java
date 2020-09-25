package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /* ‘arr’ is the given input array, and ‘n’ is the size of the array */
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int n = scanner.nextInt( );
        int[] arr = new int[ n ];
        for (int i = 0; i < n; i++) {
            arr[ i ] = scanner.nextInt( );
        }
        partitionArray( n, arr );
    }

    static void partitionArray( int n, int[] arr ) {
        /* Write your code here */

        ArrayList<Integer> positive = new ArrayList<Integer>( n );
        ArrayList<Integer> negative = new ArrayList<Integer>( n );
        for (int i = 0; i < arr.length; i++) {
            if ( arr[ i ] >= 0 ) {
                positive.add( arr[ i ] );
            } else {
                negative.add( arr[ i ] );
            }
        }
        positive.forEach( x -> System.out.println( x ) );
        negative.forEach( x -> System.out.println( x ) );
    }


}

