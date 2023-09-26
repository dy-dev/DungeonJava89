package com.arcreane.characters.hero;

import com.arcreane.architecture.Room;
import com.arcreane.characters.Character;
import com.arcreane.characters.monster.Monster;
import com.arcreane.item.Weapon;

public class Hero extends Character {
    public void enterRoom(Room p_Room) {
        Monster monster = p_Room.getMonster();
        while(monster.isAlive() && isAlive()) {
            monster.Attack(this);
            Attack(monster);
        }
        if(isAlive())
            p_Room.openChest();
    }

    @Override
    public void Attack(Character p_Character) {

    }

    @Override
    public void ReceiveDamage(Weapon p_Weapon) {

    }
}
