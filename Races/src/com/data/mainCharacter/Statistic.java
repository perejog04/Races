package com.data.mainCharacter;

import com.data.mainCharacter.race.Race;
import com.data.save.Save;

import java.io.FileNotFoundException;

public class Statistic {
    public static int health1, armor1, strength1, agility1;
    public static int health4, armor4, strength4, agility4;

    public static void giveStatistic() {
        Race.learnRace();
        health1 = Race.health;
        armor1 = Race.armor;
        strength1 = Race.strength;
        agility1 = Race.agility;
    }
    public static void ingameStatistic() throws FileNotFoundException {
        Save.load();
        health4 = Save.health2;
        armor4 = Save.armor2;
        strength4 = Save.strength2;
        agility4 = Save.agility2;
    }
}
