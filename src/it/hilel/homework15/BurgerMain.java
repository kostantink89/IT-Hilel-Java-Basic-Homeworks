package it.hilel.homework15;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("White plain bun", "Turkey", "Cheddar", "Single Lettuce", "Heinz\n");
        DietBurger dietBurger = new DietBurger("Black crispy bun", "Chicken", "Gouda", "Double Lettuce\n");
        DoubleMeatBurger doubleMeatBurger = new DoubleMeatBurger("Crispy white bun", "First slice of beef", "Second slice of beef");

        System.out.println(burger);
        System.out.println(dietBurger);
        System.out.println(doubleMeatBurger);

    }
}
