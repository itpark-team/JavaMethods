package com.company;

public class Main7 {
    public static int Sum(int i, int n) {
        if (i == n) {
            return i;
        }
        return i + Sum(i + 1, n);
    }

    public static int Sum(int n) {
        /*if (n == 1) {
            return 1;
        }*/
        //int arr[] =new int[1000000];
        return n + Sum(n);
    }

    public static void main(String[] args) {
        /*int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println(sum);*/

        //int result = Sum(8, 10);
        int result = Sum(10);
        System.out.println(result);
    }
}
