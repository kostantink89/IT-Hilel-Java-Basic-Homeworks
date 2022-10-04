package it.hilel.homework15;

public class DoubleMeatBurger extends Burger {

        private String secondMeatSlice;

        public DoubleMeatBurger(String bun, String meat, String secondMeatSlice) {
            setBun(bun);
            setMeat(meat);
            this.secondMeatSlice = secondMeatSlice;
        }

        public String getSecondMeatSlice() {
            return secondMeatSlice;
        }

        public void setSecondMeatSlice(String secondMeatSlice) {
            this.secondMeatSlice = secondMeatSlice;
        }

        @Override
        public String toString() {
            return "This double meat burger has next ingredients: \n" + "Bun: " + getBun() + "\nMeat: " + getMeat() + "\n"
                    + "Second Meat: " + getSecondMeatSlice();
        }

    }

