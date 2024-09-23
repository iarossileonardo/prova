package com.example;

public class MioThread extends Thread{

    private int n;

    public MioThread(int n){
        this.n = n;
    }

    public void run(){
        for (int i = 0; i < n; i++) {
            System.out.println("Ciao sono il thread " + Thread.currentThread().getName() + " e sono all'iterazione " + i);
        }
    }
}
