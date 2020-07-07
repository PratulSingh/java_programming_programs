package com.pratul;

import java.util.Arrays;

public class Main {
    private static int [] myArray = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
	// write your code here

        System.out.println(Arrays.toString(myArray));
        System.out.println("Length: "+myArray.length);
        resizeArray(15);
        myArray[10] = 11;
        myArray[11] = 12;
        myArray[12] = 13;
        myArray[13] = 14;
        myArray[14] = 15;
        System.out.println(Arrays.toString(myArray));
        System.out.println("Length after resize: "+myArray.length);
    }

    public static void resizeArray(int num){
        int [] original = myArray;
        myArray = new int[num];
        for(int i=0; i<original.length; i++){
            myArray[i]=original[i];
        }
    }
}
