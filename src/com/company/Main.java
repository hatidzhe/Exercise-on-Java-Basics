package com.company;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        double average;
        int number = 0;
        while ( number < 100) { number = 1 + number;
        sum = sum + number; }
        average = sum/number;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);


    }
}
