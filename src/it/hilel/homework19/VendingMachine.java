package it.hilel.homework19;

import java.util.Scanner;

public class VendingMachine {


    public void vendingMachineChoice() {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        double totalAmount = 0;
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        boolean isLoop = true;
        while (isLoop) {
            System.out.println("Choose your drink: ");
            System.out.println("\n\tCOFFEE" + "\n\tTEA" + "\n\tLEMONADE" +
                    "\n\tMOJITO" + "\n\tMINERAL WATER" + "\n\tCOKE");
            System.out.println("\nPress QUIT for EXIT");
            System.out.print("Enter your drink here: ");
            String userChoice = scan.nextLine();
            DrinksMachine machine = DrinksMachine.valueOf(userChoice.toUpperCase());
            switch (machine) {
                case COFFEE -> {
                    System.out.println("Coffee is brewing " + "\nPrice: $" + DrinksPrice.COFFEE_PRICE);
                    totalAmount += DrinksPrice.COFFEE_PRICE;
                    counter++;
                }
                case TEA -> {
                    System.out.println("Tea is brewing" + "\nPrice: $" + DrinksPrice.TEA_PRICE);
                    totalAmount += DrinksPrice.TEA_PRICE;
                    counter++;
                }
                case LEMONADE -> {
                    System.out.println("Lemonade is making out of lemon " + "\nPrice: $" + DrinksPrice.LEMONADE_PRICE);
                    totalAmount += DrinksPrice.LEMONADE_PRICE;
                    counter++;
                }
                case MOJITO -> {
                    System.out.println("Mojito is making out of lime " + "\nPrice: $" + DrinksPrice.MOJITO_PRICE);
                    totalAmount += DrinksPrice.MOJITO_PRICE;
                    counter++;
                }
                case MINERAL_WATER -> {
                    System.out.println("Plain mineral water " + "\nPrice: $" + DrinksPrice.MINERAL_WATER_PRICE);
                    totalAmount += DrinksPrice.MINERAL_WATER_PRICE;
                    counter++;
                }
                case COKE -> {
                    System.out.println("Coke is made out of sugar " + "\nPrice: $" + DrinksPrice.COKE_PRICE);
                    totalAmount += DrinksPrice.COKE_PRICE;
                    counter++;
                }
                case QUIT -> {
                    System.out.println("\nYou choice is: " + counter + " item(s)");
                    System.out.println("Total price = $" + totalAmount);
                    isLoop = false;
                }
            }
        }
    }
}







