package com.data.mainCharacter.race;

import com.data.save.newGame.NewGame;

public class Race {
    public static int race1, health, strength, agility, armor;

    public static void learnRace() {
        race1 = NewGame.race;

        if (race1 == 1) {      // human
            health = 100;
            armor = 0;
            strength = 7;
            agility = 6;
        }
        if (race1 == 2) {      // elf
            health = 100;
            armor = 0;
            strength = 4;
            agility = 9;
        }
        if (race1 == 3) {      // orc
            health = 100;
            armor = 0;
            strength = 10;
            agility = 3;
        }
    }
}
