package ru.petrov.singleton;

import java.time.LocalDate;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void printInfo(Object obj, String info) {
        System.out.println("Log info: " + LocalDate.now() + " - " + obj.getClass().getSimpleName() + " - " + info);
    }

}
