package com.pratul;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GroceryList groceryList = new GroceryList();

        groceryList.addGroceryItem("Apple");
        groceryList.addGroceryItem("Banana");
        groceryList.addGroceryItem("Orange");
        groceryList.addGroceryItem("Pineapple");
        groceryList.addGroceryItem("Melon");

        groceryList.printGroceryList();

        groceryList.modifyGroceryList(3, "Grapes");

        groceryList.printGroceryList();

        groceryList.removeGroceryItem(2);

        groceryList.printGroceryList();

        System.out.println(groceryList.findItem("Melon"));



    }
}
