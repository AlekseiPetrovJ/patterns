package ru.petrov.proxy;

public class ConnectorImplProxy implements Connector {
    private final ConnectorImpl connector = new ConnectorImpl();

    @Override
    public void connect(String dbName) {
        connector.connect("/localhost:5432/" + dbName);
    }
}
