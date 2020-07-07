package com.pratul;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer myInt = 56;  // Integer myInt = new Integer(56);
        Double myDouble = 2.56; //Double myDouble = new Double(2.56);



        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        intArrayList.add(5);  //intArrayList.add(Integer.valueOf(5)); //autoboxing
        System.out.println(intArrayList.get(0)); //intArrayList.get(i).intValue; //unboxing
    }
}
