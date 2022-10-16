package it.hilel.homework17;

public class Androids implements Smartphones, LinuxOS {


    @Override
    public void call() {
        System.out.println("My Samsung Galaxy S9 is calling");
    }

    @Override
    public void sms() {
        System.out.println("My Samsung Galaxy S9 is sending messages");
    }

    @Override
    public void internet() {
        System.out.println("My Samsung Galaxy S9 has 4G LTE");
    }

    @Override
    public void operationSystem() {
        System.out.println("Android phone is compatible with Linux OS");
    }


}
