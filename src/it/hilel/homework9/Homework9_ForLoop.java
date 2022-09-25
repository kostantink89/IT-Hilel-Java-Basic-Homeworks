package it.hilel.homework9;

import java.util.Random;
import java.util.Scanner;

public class Homework9_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(10);
        System.out.print("Choose a number between 1 and 10: ");
        int guess = scan.nextInt();
        if (guess < 1 || guess > 10) {
            for (int i = 0; i <= number; i++) {
                if (guess != number) {
                    System.out.print("Guess again: ");
                    guess = scan.nextInt();
                } else {
                    System.out.println("You got it boss!");
                    break;
                }

            }
        }
    }
}

