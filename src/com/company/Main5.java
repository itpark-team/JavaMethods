package com.company;

public class Main5 {

    public static String ChangeStr(String str) {
        str += "!!!!";
        return str;
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(str);
        str = ChangeStr(str);
        System.out.println(str);
    }
}
