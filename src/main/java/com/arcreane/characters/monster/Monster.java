package com.arcreane.characters.monster;

import com.arcreane.characters.Character;
import com.arcreane.item.Weapon;

public class Monster extends Character {


    @Override
    public void Attack(Character p_CharacterToAttack) {
        p_CharacterToAttack.ReceiveDamage(m_Weapon);
    }

    @Override
    public void ReceiveDamage(Weapon p_Weapon) {

    }
}
