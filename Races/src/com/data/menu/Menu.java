package com.data.menu;

import java.util.Scanner;

public class Menu {
    public static int nextStep;

    public static void findNextStep() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Главное меню:");
        /*
         if we have save =>
         System.out.println (1. Продолжить)...
         */
        System.out.println("1. Новая игра");
        System.out.println("2. Настройки");
        System.out.println("3. Выход");
        System.out.println();
        nextStep = scan.nextShort();

        switch (nextStep) {
            case 1:             // новая игра
                System.out.println("New game!");
                break;
            case 2:             // настройки
                break;
            case 3:
                System.exit(0);
                break;
        }
        if (nextStep != 1 & nextStep != 2 & nextStep != 3) {
            System.out.println("Неверно выбранное действие!");
            System.out.println();
            Menu.findNextStep();
        }
    }
}
