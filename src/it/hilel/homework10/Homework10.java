package it.hilel.homework10;

public class Homework10 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i / 10 != 4 && i / 10 != 9 && i % 10 != 4 && i % 10 != 9 && (i / 10 % 10 != 4)) {
                System.out.println(i);
            }
        }

    }
}

