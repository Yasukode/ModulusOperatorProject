package com.LickingHeights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        testOddness();
        keepContained();
    }


     //todo: even or odd
    public static void testOddness() {//Is the number even or odd?
        Scanner userInput = new Scanner(System.in);
        int positiveNumber;
        System.out.println("Name any positive number.");
        positiveNumber = userInput.nextInt();
        System.out.println("The number is odd: "+(positiveNumber%2!=0));

    }//todo: keep number contained
    public static void keepContained() {//We need to keep the number contained
         Scanner userInput = new Scanner(System.in);
         System.out.println("Give me another positive number.");
        int positiveNumberII = userInput.nextInt();

        System.out.println("Number contained is: "+(positiveNumberII%8+5));



    }
//todo: get the last digit
}


