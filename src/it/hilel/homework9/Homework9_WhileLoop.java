package it.hilel.homework9;

import java.util.Random;
import java.util.Scanner;

public class Homework9_WhileLoop {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(10);
        System.out.print("Choose a number between 1 and 10: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();
        while (guess != number) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }
        System.out.println("You got it!");
        scan.close();
    }
}

