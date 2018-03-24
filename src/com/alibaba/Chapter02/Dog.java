package com.alibaba.Chapter02;

public class Dog {

    String name;
    String says;

    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.name = "spot";
        d1.says = "Ruff";
        System.out.println(" My name is " + d1.name + " sound " + d1.says);

        Dog d2 = new Dog();
        d2.name = "scruffy";
        d2.says = "Wurf";
        System.out.println(" My name is " + d2.name + " sound " + d2.says);

        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

        System.out.println(d1.name == d2.name);
        System.out.println(d1.name.equals(d2.name));

        System.out.println(d1.says == d2.says);
        System.out.println(d1.says.equals(d2.says));

        Dog d3 = new Dog();
        d3 = d1;
        System.out.println(d1 == d3);
        System.out.println(d1.equals(d3));

        System.out.println(d1.name == d3.name);
        System.out.println(d1.name.equals(d3.name));

        System.out.println(d1.says == d3.says);
        System.out.println(d1.says.equals(d3.says));
    }
}
