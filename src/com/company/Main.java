package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Calculator myCalculator= new Calculator();

        myCalculator.thisIsAReallyBadMethodName(5);
        myCalculator.setheight(10);

        System.out.println(myCalculator.calculateArea());

    }
}
