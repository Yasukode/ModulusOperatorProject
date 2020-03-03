package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testOddness();
    }
//Is the number even or odd?
//todo: even or odd
//todo: keep number contained
//todo: get the last digit
    public static void testOddness() {
        Scanner userInput = new Scanner(System.in);
        int positiveNumber;
        System.out.println("Name any positive number.");
        positiveNumber = userInput.nextInt();
        System.out.println("The number is odd: "+(positiveNumber % 2 !=0));
    }
}


