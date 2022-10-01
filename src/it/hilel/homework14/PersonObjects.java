package it.hilel.homework14;

public class PersonObjects {
    public static void main(String[] args) {
        Person firstPerson = new Person("Will", "Smith", "New York", "2936729462846.");
        System.out.println(firstPerson.personInfo() + "\n");
        Person secondPerson = new Person("Jackie", "Chan", "Shanghai", "12312412412.");
        System.out.println(secondPerson.personInfo() + "\n");
        Person thirdPerson = new Person("Sherlock", "Holmes", "London", "37742123513.");
        System.out.println(thirdPerson.personInfo());
    }
}
