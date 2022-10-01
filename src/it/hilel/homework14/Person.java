package it.hilel.homework14;

public class Person {
    String name;
    String lastName;
    String city;
    String phoneNumber;


    public Person(String name, String lastName, String city, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;

    }

    public String personInfo() {
        return "You can reach out " + "Mr." + this.name + " " + this.lastName + " from city " + this.city +
                " by phone number " + this.phoneNumber;

    }
}

