package ru.petrov.factory;

public class Espresso extends Coffee {
    @Override
    public String brew() {
        return "Эспрессо заварен";
    }
}
