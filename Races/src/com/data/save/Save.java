package com.data.save;

import com.data.mainCharacter.Statistic;

import java.io.*;
import java.util.Scanner;

public class Save {
    public static int health, armor, strength, agility;
    public static int health2, armor2, strength2, agility2;
    public static int health3, armor3, strength3, agility3;
    public static int[] numbers;
    public static String[] numbersString;

    public static void autoSave() {
        health = Statistic.health1;
        armor = Statistic.armor1;
        strength = Statistic.strength1;
        agility = Statistic.agility1;

        try {
            File saveFile = new File("autosave.txt");
            PrintWriter pw = new PrintWriter(saveFile);
            pw.print(health + " " + armor + " " + strength + " " + agility);
            pw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void load() throws FileNotFoundException {
        File saveFile = new File("autosave.txt");
        Scanner scan = new Scanner(saveFile);
        String line = scan.nextLine();
        numbersString = line.split(" ");
        numbers = new int[4];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
            health2 = numbers[0];
            armor2 = numbers[1];
            strength2 = numbers[2];
            agility2 = numbers[3];
        }
        scan.close();
    }
    public static void save() throws FileNotFoundException {
        Statistic.ingameStatistic();
        health3 = Statistic.health4;
        armor3 = Statistic.armor4;
        strength3 = Statistic.strength4;
        agility3 = Statistic.strength4;
    }
}