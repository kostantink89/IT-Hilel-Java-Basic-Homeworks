package it.hilel.homework17;

public class CellPhone {
    public static void main(String[] args) {
        Androids samsung = new Androids();
        samsung.call();
        samsung.sms();
        samsung.internet();
        samsung.operationSystem();

        System.out.println();

        Iphones applePhone = new Iphones();
        applePhone.call();
        applePhone.sms();
        applePhone.internet();
        applePhone.operationSystem();


    }
}
