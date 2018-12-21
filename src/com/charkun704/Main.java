/*
This program takes in integers, puts them in an array, scans that array for the minimum, and prints it out.
Assume user will only put integer characters.
 */
package com.charkun704;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter array length:");
        int arrayLength = sc.nextInt();
        sc.nextLine();

        int[] array = readInts(arrayLength);
        int minVal = findMin(array);

        System.out.println("min is "+minVal);
    }

    public static int[] readInts(int arrayLength){
        int [] intArray = new int[arrayLength];

        for(int i=0;i<intArray.length;i++){
            System.out.println("Enter integer value to put into array.");
            int intValue = sc.nextInt();
            sc.nextLine();
            intArray[i]= intValue;
        }
        return intArray;
    }

    public static int findMin(int[] array){
        int minValue = Integer.MAX_VALUE;

        for(int i=0;i<array.length;i++){
            int intValue = array[i];
            if(intValue < minValue){ minValue = intValue; }
        }
        return minValue;
    }
}
