package ru.petrov.proxy;

public class ConnectorImpl implements Connector {
    @Override
    public void connect(String url) {
        System.out.println("подключено: " + url);
    }
}
