package com.arcreane.characters;

import com.arcreane.item.Weapon;

abstract public class Character {
    protected int m_iLifePoints;
    protected Weapon m_Weapon;

    abstract public void Attack(Character p_CharacterToAttack);

    abstract public void ReceiveDamage(Weapon p_Weapon);

    public boolean isAlive() {
        return m_iLifePoints > 0;
    }

    ;
}
