package it.hilel.homework11;

import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {
        int[] teamHawks = new int[26];
        int[] teamPhoenix = new int[26];
        Random random = new Random();
        int totalHawksAge = 0;
        int totalPhoenixAge = 0;

        System.out.println("Age of each player in team HAWKS: ");
        for (int i = 1; i < teamHawks.length; i++) {
            int randomAge = random.nextInt(40 - 18 + 1) + 18;
            System.out.print(randomAge + " ");
            totalHawksAge += teamHawks[i] + randomAge;

        }
        System.out.println('\n');
        System.out.println("Age of each player in team PHOENIX: ");
        for (int i = 1; i < teamPhoenix.length; i++) {
            int randomAge = random.nextInt(40 - 18 + 1) + 18;
            System.out.print(randomAge + " ");
            totalPhoenixAge += teamPhoenix[i] + randomAge;

        }
        System.out.println("\n");
        int teamHawksAverageAge = totalHawksAge / teamHawks.length;
        System.out.println("The average age in team HAWKS is: " + teamHawksAverageAge + " years old");
        int teamPhoenixAverageAge = totalPhoenixAge / teamPhoenix.length;
        System.out.println("The average age in team PHOENIX is: " + teamPhoenixAverageAge + " years old");

    }

}
