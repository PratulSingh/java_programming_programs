package com.pratul;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1,2,3,4,5};
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
