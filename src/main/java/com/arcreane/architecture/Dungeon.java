package com.arcreane.architecture;

import com.arcreane.characters.hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class Dungeon {
    Hero m_Hero;
    List<Room> m_RoomsArray;

    public Dungeon(int p_iNbRooms) {
        m_RoomsArray = new ArrayList<>();
        for (int i = 0; i < p_iNbRooms; i++) {
            m_RoomsArray.add(new Room());
        }
    }

    public boolean greet(Hero hero) {
        m_Hero = hero;
        for (var room :m_RoomsArray ) {
            m_Hero.enterRoom(room);
            if(!m_Hero.isAlive())
                return false;
        }
        return true;
    }
}
