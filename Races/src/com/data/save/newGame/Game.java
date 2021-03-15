package com.data.save.newGame;

import com.data.mainCharacter.Statistic;
import com.data.menu.Menu;
import com.data.save.Save;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Game {
    public static int nextSafe, nextStep1;

    public static void startGame() throws FileNotFoundException {
        Menu.findNextStep();                // main menu
        nextStep1 = Menu.nextStep;
        if (nextStep1 == 1) {
            NewGame.findRace();
        }

        Statistic.giveStatistic();      // give statistic for character
        Save.autoSave();                    // save character's statistic
        Save.load();                    // load character's statistic
        Game.safe();
    }

    public static void safe() throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите дальнейшие действия:");
        //System.out.println("1. Отправиться в таверну");
        //System.out.println("2. Отправиться на охоту на монстров");
        //System.out.println("3. Отправиться на сбор ресурсов");
        System.out.println("4. Сохраниться");
        System.out.println("5. Выйти в главное меню");
        System.out.println("6. Выйти из игры");
        System.out.println();
        nextSafe = scan.nextShort();
        switch (nextSafe) {
            case 4:
                Save.save();
                break;
            case 5:
                Game.startGame();
                break;
            case 6:
                System.exit(0);
                break;
        }
        if (nextSafe != 1 & nextSafe != 2 & nextSafe != 3 & nextSafe != 4 & nextSafe != 5 & nextSafe != 6) {
            System.out.println("Неверно выбранное действие!");
            System.out.println();
            Game.safe();
        }
    }
}
