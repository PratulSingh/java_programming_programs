package com.pratul;

import java.util.Scanner;

public class Main {

    private static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myIntArray = getArray(5);
        for(int i=0; i<myIntArray.length; i++){
            System.out.println("Elements "+i+" Value "+myIntArray[i]);
        }
        System.out.println("Average is: "+getAverage(myIntArray));
    }
    public static int[] getArray(int num){
        System.out.println("Enter "+num+" elements: \r" );
        int[] values = new int[num];
        for(int i=0;i<num;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i=0; i<array.length;i++){
            sum += array[i];
        }
        return (double)sum/(double)array.length;
    }
}
