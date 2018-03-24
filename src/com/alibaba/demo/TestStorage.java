package com.alibaba.demo;

public class TestStorage {

    public static void main(String[] args){
        Storage storage = new Storage();
        int hello = storage.storage("Hello");
        System.out.print(hello);

       Storage.testValue();

        Storage storage1 = new Storage();
        storage1.testValue();
        storage.testValue();
    }


}
