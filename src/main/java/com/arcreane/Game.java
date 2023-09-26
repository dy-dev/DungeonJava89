package com.arcreane;

import com.arcreane.architecture.Dungeon;
import com.arcreane.characters.hero.Hero;
import org.w3c.dom.ls.LSOutput;

public class Game {
    public static void main( String[] args ) {
        Dungeon dungeon = new Dungeon(5);
        Hero hero = new Hero();

        boolean isAlive = dungeon.greet(hero);

        if(isAlive)
        {
            System.out.println("Congrats you won");
        }
        else {
            System.out.println("Too bad, you'll do better next time");
        }
        //Give the option to the user to play again
        //Easiest way is to create a dedicated function outside the main
        //and call it again until the user wants to quit (do that in a while loop)
    }
}
