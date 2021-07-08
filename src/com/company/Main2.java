package com.company;

public class Main2 {

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    /*public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }*/

    public static void main(String[] args) {
        System.out.println(getMax(getMax(getMax(3,5),8),10));
    }
}
