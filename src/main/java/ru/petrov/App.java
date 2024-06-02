package ru.petrov;

import ru.petrov.adapter.CardReader;
import ru.petrov.adapter.MemoryCard;
import ru.petrov.adapter.Usb;
import ru.petrov.factory.Coffee;
import ru.petrov.factory.CoffeeFactory;
import ru.petrov.proxy.ConnectorImplProxy;
import ru.petrov.singleton.Singleton;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //Синглтон
        System.out.println("-------------------Singleton-------------------");
        Singleton.getInstance().printInfo(new ArrayList<>(), "some info");

        //Фабрика
        System.out.println("-------------------Factory-------------------");
        Coffee espresso = CoffeeFactory.getCoffee("espresso");
        System.out.println(espresso.brew());

        Coffee americano = CoffeeFactory.getCoffee("americano");
        System.out.println(americano.brew());

        //Адаптер
        System.out.println("-------------------Adapter-------------------");
        Usb cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();

        //Прокси
        System.out.println("-------------------Proxy-------------------");
        new ConnectorImplProxy().connect("neoflex1");
    }
}
