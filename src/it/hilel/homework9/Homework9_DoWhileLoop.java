package it.hilel.homework9;

import java.util.Random;
import java.util.Scanner;

public class Homework9_DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        int guess = 0;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            guess = input.nextInt();
        } while (guess != randomNumber);
        System.out.println("You got it boss!");
    }
}

