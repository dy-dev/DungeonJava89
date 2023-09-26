package com.arcreane.characters.monster;

import java.util.Random;

public class MonsterFactory {
    private static Random rand = new Random();

    public static Monster generateMonster() {
        int randType = rand.nextInt(0,MonsterType.values().length);
        switch (MonsterType.valueOf(randType)){

            case BARBARIAN -> {
                System.out.println("Create a Barbarian");
                return new Barbarian();
            }
            case WIZARD -> {
                System.out.println("Create a Wizard");
                return new Wizard();
            }
            default -> {

                System.out.println("Don't know what you want, you get a barbarian");
                return new Barbarian();
            }
        }

    }
}
