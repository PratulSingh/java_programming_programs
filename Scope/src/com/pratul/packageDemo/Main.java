package com.pratul.packageDemo;


public class Main {

    public static void main(String[] args) {

        String varFour = "This private to main";
        System.out.println(varFour);

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("ScopeInstance varOne is "+scopeInstance.getVarOne());
        scopeInstance.timesTwo();

        System.out.println("***********************************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

    }
}
