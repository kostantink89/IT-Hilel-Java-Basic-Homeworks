package it.hilel.homework15;

public class Burger {

    private String bun;
    private String meat;
    private String cheese;
    private String salad;
    private String mayo;


    public Burger() {
    }

    public Burger(String bun, String meat, String cheese, String salad, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayo = mayo;

    }


    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String getMayo() {
        return mayo;
    }

    public void setMayo(String mayo) {
        this.mayo = mayo;
    }

    public String toString() {
        return "This regular burger has next ingredients: " +
                " \n" + "Bun: " + getBun() + "\nMeat: " + getMeat() + "\nCheese: " + getCheese() +
                "\nSalad: " + getSalad() + "\nMayo: " + getMayo();
    }
}

