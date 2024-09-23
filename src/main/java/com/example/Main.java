package com.example;

public class Main {
    public static void main(String[] args) {
        int n = 100;
        MioThread t0 = new MioThread(n);
        MioThread t1 = new MioThread(200);
        t0.start();
        t1.start();
    }
}