package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String myAinazik;
        final int NUM = 21;
        String word = "День рождения";
        myAinazik = NUM + word;
        System.out.println(myAinazik);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }
    }
}
