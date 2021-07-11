package com.company;

public class Main6 {
    public static void main(String[] args) {
        int a = 2000000000;

        for (int i = 0; i < 100000000; i++) {
            System.out.println(a);
            a+=100000000;
        }
    }
}
