package com.arcreane.architecture;

import com.arcreane.characters.monster.Monster;
import com.arcreane.characters.monster.MonsterFactory;
import com.arcreane.item.Chest;

public class Room {
    Monster m_Monster;
    Chest m_Chest;
    public Room() {
        m_Monster = MonsterFactory.generateMonster();
        m_Chest = new Chest();
    }

    public Monster getMonster() {
        return m_Monster;
    }

    public void openChest() {
    }
}
