package com.arcreane.characters.monster;

import java.util.HashMap;
import java.util.Map;

public enum MonsterType {
    BARBARIAN(0),
    WIZARD(1);

    private final int m_ivalue;
    private static final Map<Integer, MonsterType> map = new HashMap<>();
    static {
        for (MonsterType mt : MonsterType.values())
            map.put(mt.m_ivalue, mt);
    }
    MonsterType(int p_iValue) {
        m_ivalue = p_iValue;
    }

    public static MonsterType valueOf(int monsterType) {
        return (MonsterType) map.get(monsterType);
    }

    public int getValue() {
        return m_ivalue;
    }
}
