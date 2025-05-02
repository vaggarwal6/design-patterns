package com.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton1 hash : " + singleton.toString());

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2 hash : " +singleton2.toString());
    }
}
