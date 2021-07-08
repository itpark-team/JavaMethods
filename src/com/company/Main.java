package com.company;

import java.util.Scanner;

public class Main {

    public static int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public static int inputInt(String message) {
        int number = 0;
        boolean inputResult = false;

        do {
            try {
                Scanner input = new Scanner(System.in);
                inputResult = true;

                System.out.print(message);
                number = input.nextInt();
            } catch (Exception e) {
                System.out.println("Error. it's not a number");
                inputResult = false;
            }

        } while (inputResult == false);

        return number;
    }

    public static void printResult(int result) {
        System.out.println("sum = " + result);
    }

    public static void helloWorld() {
        System.out.println("hello world");
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static int sumFrom1ToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        /*int a = inputInt("input a: ");
        int b = inputInt("input b: ");

        int result = sum(a, b);

        printResult(result);*/

        /*helloWorld();
        printText("hello world");
        printText("aaaaa...!");*/

        System.out.println(sumFrom1ToN(10));
        System.out.println(sumFrom1ToN(5));
        int count = 18;
        System.out.println(sumFrom1ToN(count));
    }
}
