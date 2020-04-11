package com.company;

public class Main {

    public static void main(String[] args) {
        Object myObj = new Object();
        System.out.println(myObj);

        String myStr = myObj.toString();
        System.out.println(myStr);
        System.out.println(myStr.length());
    }
}
