package com.data.save.newGame;

import java.util.Scanner;

public class NewGame {
    public static int race;

    public static void findRace() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите расу:");
        System.out.println("1. Человек");
        System.out.println("2. Эльф");
        System.out.println("3. Орк");
        System.out.println();

        race = scan.nextInt();
    }
}
