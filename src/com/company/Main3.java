package com.company;

public class Main3 {


    public static void Obmen(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.printf("IN METHOD: a = %d b = %d\n", a, b);
    }



    public static void main(String[] args) {
        int a = 3, b = 5;
        System.out.printf("a = %d b = %d\n", a, b);
        Obmen(a, b);
        System.out.printf("a = %d b = %d\n", a, b);
    }
}
