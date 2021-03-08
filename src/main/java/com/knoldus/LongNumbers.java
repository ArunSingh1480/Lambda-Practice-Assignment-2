package com.knoldus;

import java.util.Scanner;

public abstract class LongNumbers implements Even{
    public static void main(String[] args) {
        System.out.println("Enter the Value");
        Scanner sc=new Scanner(System.in);
        long x= sc.nextLong();
        Long getNextEvenNum = (Long) getNextEven.getNextEvenNumber.apply(x);
        System.out.println("Next Even numbers is: " +getNextEvenNum);
    }
}
