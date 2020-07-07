package com.pratul;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	 // write your code here
        System.out.println("Enter no. of elements: \r");
        int arraySize = scanner.nextInt();
        int[] myArray = getIntegers(arraySize);
        int[] mySortedArray = sortArray(myArray);
        printArray(mySortedArray);

    }

    public static int[] getIntegers(int num){
        System.out.println("Enter array elements: \r");
        int[] array = new int[num];
        for(int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortArray(int[] array){
        int temp;
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i];
            }
        boolean flag = true;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array){
        System.out.println("Sorted array is: \r");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}

