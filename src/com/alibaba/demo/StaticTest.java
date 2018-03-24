package com.alibaba.demo;

public class StaticTest {

    public static int i = 47;

    public static void main(String[] args) {
        //System.out.println("Hello World!");

        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i);
        System.out.println(st2.i);
        System.out.println(StaticTest.i++);
        System.out.println(st1.i);
        System.out.println(st2.i);
    }
}
