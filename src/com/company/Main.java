package com.company;

import java.util.Random;

public class Main<age> {

    public static String people(int age, int temp) {
        String agree = "Можно идти гулять";
        String sitAtHome = "Оставайтесь дома";
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return agree;
        } else if (age < 20 && temp > 0 && temp < 28) {
            return agree;
        } else if (age > 45 || temp > -10 && temp < 25) {
            return agree;
        } else {
            return sitAtHome;
        }
    }


    public static void main(String[] args) {

        System.out.println(people(7, 10));
        System.out.println(people(15, -30));
        System.out.println(people(22, 10));
        System.out.println(people(43, 50));
        System.out.println(people(7, 10));
    }
}

