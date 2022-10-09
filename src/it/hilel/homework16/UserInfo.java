package it.hilel.homework16;

public class UserInfo {
    public static void main(String[] args) {
        FitnessTracker userOne = new FitnessTracker("Andy", "Jackson", 1984, "450-7654-1190",
                "andyjackson@gmail.com", 75, "120 / 30", 11000);

        userOne.printAccountInfo();

        FitnessTracker userTwo = new FitnessTracker("Peter", "Smith", 1990, "115-200-8902",
                "petersmith@gmail.com", 82, "140 / 35", 9500);

        userTwo.printAccountInfo();

        FitnessTracker userThree = new FitnessTracker("Samantha", "Wilson", 1980, "250-900-7645",
                "coolsamantha@gmail.com", 65, "120 / 85", 8000);

        userThree.printAccountInfo();

        FitnessTracker userFour = new FitnessTracker("Ronny", "Clark", 1990, "715-256-8972",
                "ronnyclark@yahoo.ca", 90, "145 / 80", 12000);

        // changing fields for user four
        userFour.setBloodPressure("120 / 70");
        userFour.setLastName("Jensen");
        userFour.setNumberOfStepsPerDay(15000);

        userFour.printAccountInfo();

        FitnessTracker userFive = new FitnessTracker("Kattie", "Brooks", 1995, "675-111-9075",
                "katie@gmail.com", 60, "120/60", 7450);

        // changing fields for user five
        userFive.setWeight(75);
        userFive.setNumberOfStepsPerDay(9645);
        userFive.setLastName("Coleman");

        userFive.printAccountInfo();


    }
}
