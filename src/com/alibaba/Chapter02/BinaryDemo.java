package com.alibaba.Chapter02;

public class BinaryDemo {

    public static void main(String[] args){
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1));

        int i2 = 0x2F;
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177;
        System.out.println(" i3: " + Integer.toBinaryString(i3));
    }

}
