package it.hilel.homework16;


public class FitnessTracker {
    private final int CURRENT_YEAR = 2022;
    private final String FIRST_NAME;
    private String lastName;
    private final int YEAR_OF_BIRTH;
    private final String PHONE_NUMBER;
    private final String EMAIL;
    private int weight;
    private String bloodPressure;
    private int numberOfStepsPerDay;

    private int age;


    public FitnessTracker(String firstName, String lastName, int yearOfBirth, String phoneNumber, String email,
                          int weight, String bloodPressure, int numberOfStepsPerDay) {
        this.FIRST_NAME = firstName;
        this.lastName = lastName;
        this.YEAR_OF_BIRTH = yearOfBirth;
        this.EMAIL = email;
        this.PHONE_NUMBER = phoneNumber;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.numberOfStepsPerDay = numberOfStepsPerDay;

    }

    public String getFirstName() {
        return FIRST_NAME;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return YEAR_OF_BIRTH;
    }

    public String getPhoneNumber() {
        return PHONE_NUMBER;
    }

    public String getEmail() {
        return EMAIL;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getNumberOfStepsPerDay() {
        return numberOfStepsPerDay;
    }

    public void setNumberOfStepsPerDay(int numberOfStepsPerDay) {
        this.numberOfStepsPerDay = numberOfStepsPerDay;
    }

    public int getAge() {
        return CURRENT_YEAR - getYearOfBirth();

    }

    public void printAccountInfo() {
        System.out.println("\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() +
                "\nYear of birth: " + getYearOfBirth() + "\nAge: " + getAge() + " years old" + "\nEmail: " + getEmail() +
                "\nPhone Number: " + getPhoneNumber() + "\nWeight: " + getWeight() + "\nPressure: " +
                getBloodPressure() + "\nNumber of steps: " + getNumberOfStepsPerDay());
    }


}
