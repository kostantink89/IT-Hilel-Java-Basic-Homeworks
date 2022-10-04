package it.hilel.homework12;

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int[] firstArray = new int[7];
        int[] secondArray = new int[7];
        int counter = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(9);
        }
        Arrays.sort(firstArray);

        for (int j = 0; j < secondArray.length; j++) {
            secondArray[j] = random.nextInt(9);
        }
        Arrays.sort(secondArray);

        System.out.print("Sorted first array: " + Arrays.toString(firstArray));
        System.out.print("\nSorted second array: " + Arrays.toString(secondArray));

        for (int i = 0; i < 7; i++)
            if (firstArray[i] == secondArray[i]) {
                counter++;
            }

        System.out.println("\nNumber of matches: " + counter);
    }
}

