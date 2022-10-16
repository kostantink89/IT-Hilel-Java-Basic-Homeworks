package it.hilel.homework17;

public class Iphones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("My Apple Iphone 13 MAX is calling");
    }

    @Override
    public void sms() {
        System.out.println("My Apple Iphone 13 MAX is sending message");
    }

    @Override
    public void internet() {
        System.out.println("My Apple Iphone 13 MAX has 5G internet");

    }

    @Override
    public void operationSystem() {
        System.out.println("Iphone 13 MAX has iOS operation system");
    }
}
