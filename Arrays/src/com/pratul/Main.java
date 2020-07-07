package com.pratul;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "Hello World";
        char[] myCharArray = new char[myString.length()];
        myString = myString.toLowerCase();
        for(int i=0; i<myString.length();i++){
            char temp = myString.charAt(i);
            myCharArray[i] = temp;
        }
        for(int i=0;i<myCharArray.length;i++){
            System.out.println(myCharArray[i]);
        }
    }
}
