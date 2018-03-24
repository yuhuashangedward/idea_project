package com.alibaba.demo;

public class Incrementable {
    public static void increment(){
        StaticTest.i++;
    }

    public static void main(String[] args){
        Incrementable incrementable = new Incrementable();
        incrementable.increment();
        System.out.println(StaticTest.i);
    }
}
