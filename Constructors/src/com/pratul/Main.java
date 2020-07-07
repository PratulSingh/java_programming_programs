package com.pratul;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount bobsAccount = new BankAccount("12345", 0.00, "Bob Brown", "myemail@gmail.com", "0987654321");

        System.out.println(bobsAccount.getAccountNumber());
        bobsAccount.withdrawal(100.0);
        bobsAccount.deposit(100.0);

        BankAccount timsAccount = new BankAccount();
        System.out.println(timsAccount.getEmail());

        BankAccount adamsAccount = new BankAccount("Adam", "adam@gmail.com", "12345");
        System.out.println(adamsAccount.getEmail());
    }
}
