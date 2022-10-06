package it.hilel.homework16;


public class FitnessTracker {
    public final int CURRENT_YEAR = 2022;

    public String lastName;
    public int weight;
    public String bloodPressure;
    public int numberOfStepsPerDay;


    private String firstName;

    private int yearOfBirth;
    private String email;
    private String phoneNumber;

    private int age;


    public FitnessTracker(String firstName, String lastName, int yearOfBirth, String email, String phoneNumber,
                          int weight, String bloodPressure, int numberOfStepsPerDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.numberOfStepsPerDay = numberOfStepsPerDay;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return CURRENT_YEAR - getYearOfBirth();
    }


    public void printAccountInfo() {
        System.out.println("\nFirst Name: " + getFirstName() +   "\nLast Name: " + this.lastName +
               "\nYear of birth: " + this.yearOfBirth + "\nAge: " + getAge() +" years old" + "\nEmail: " + getEmail() +
                "\nPhone Number: "+ getPhoneNumber() + "\nWeight: " + this.weight + "\nPressure: " +
                 this.bloodPressure +"\nNumber of steps: " + this.numberOfStepsPerDay);
    }


}
