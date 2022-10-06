package it.hilel.homework16;

public class UserInfo {
    public static void main(String[] args) {
        FitnessTracker userOne = new FitnessTracker("Andy", "Jackson", 1984, "andy@yahoo.com",
                "265-110-775", 75, "120 / 30", 11000);

        userOne.printAccountInfo();

        FitnessTracker userTwo = new FitnessTracker("Peter", "Smith", 1990, "petersmith@gmail.com",
                "115-200-8902", 82, "140 / 35", 9500);

        userTwo.printAccountInfo();

        FitnessTracker userThree = new FitnessTracker("Samantha", "Wilson", 1980, "coolsamantha@gmail.com",
                "250-900-7645", 65, "120 / 85", 8000);

        userThree.printAccountInfo();

        FitnessTracker userFour = new FitnessTracker("Ronny", "Clark", 1990, "ronnyclark@yahoo.ca",
                "715-256-8972", 90, "145 / 80", 12000);

        // changing fields for user four
        userFour.setPhoneNumber("825-900-8534");
        userFour.setEmail("clark.ronny@gmail.com");
        userFour.numberOfStepsPerDay = 8700;

        userFour.printAccountInfo();

        FitnessTracker userFive = new FitnessTracker("Kattie", "Brooks", 1995, "katie@gmail.com",
                "675-111-9075", 60, "120/60", 7450);

        // changing fields for user five
        userFive.setEmail("katiebrooks@hotmail.com");
        userFive.setYearOfBirth(1997);
        userFive.setPhoneNumber("435-1010-9076");


        userFive.printAccountInfo();






    }
}
