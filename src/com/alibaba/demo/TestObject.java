package com.alibaba.demo;

public class TestObject {

    public static void main(String[] args){

      /*  Person person = new Person();
        System.out.println(person.toString());
        System.out.println("年龄："+person.getAge() + "性别：" + person.getSex() + "姓名：" + person.getName());*/

        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 47;
        dataOnly.d = 1.1;
        dataOnly.b = false;
        System.out.print(dataOnly.i + "||" + dataOnly.d + "|||" + dataOnly.b);
    }
}
