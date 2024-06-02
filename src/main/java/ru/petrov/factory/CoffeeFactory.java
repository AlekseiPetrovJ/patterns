package ru.petrov.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type) {
        switch (type) {
            case ("espresso"):
                return new Espresso();
            case ("americano"):
                return new Americano();
            default:
                throw new IllegalArgumentException("Неизвестный тип кофе: " + type);
        }

    }
}
