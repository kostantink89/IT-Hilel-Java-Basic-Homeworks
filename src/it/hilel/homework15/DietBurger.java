package it.hilel.homework15;

public class DietBurger extends Burger{

        public DietBurger(String bun, String meat, String cheese, String salad) {
            setBun(bun);
            setMeat(meat);
            setCheese(cheese);
            setSalad(salad);
        }

        @Override
        public String toString() {
            return "This diet burger has next ingredients: \n" + "Bun: " + getBun() + "\nMeat: " + getMeat() + "\nCheese: " + getCheese() +
                    "\nSalad: " + getSalad();
        }

    }

