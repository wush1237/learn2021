package com.Horse;

public class Tester {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        HorseRunnable h2 = new HorseRunnable();
        Thread thread = new Thread(h2);

        h1.start();
        thread.start();
    }
}
