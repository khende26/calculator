package com.company;
public class Calculator
{

    private int width;
    private int height;

    // Here's a method:
    public int calculateArea() {
        int Area = width * height;
        return Area;

    }

    // "Set" accessor method / "setter":
    public void thisIsAReallyBadMethodName(int newWidth) {

       width = newWidth;
    }

    // "Get" accessor method / "getter":
    public int getwidth() {

        return width;
    }

    // "Set" accessor method / "setter":
    public void setheight(int newHeight) {

        height = newHeight;
    }

    // "Get" accessor method / "getter":
    public int getheight() {

        return height;
    }

}



