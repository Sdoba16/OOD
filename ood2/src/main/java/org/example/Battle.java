package org.example;

import org.example.characters.UnitInArmy;

public class Battle {
    public static boolean fight(UnitInArmy opponent1, UnitInArmy opponent2) {
        if (opponent1 == null) return false;
        if (opponent2 == null) return true;
        while (opponent1.isAlive() && opponent2.isAlive()) {
            opponent1.hit(opponent2);
            if (opponent2.isAlive()) opponent2.hit(opponent1);
        }
        return opponent1.isAlive();
    }

    public static boolean fight(Army army1, Army army2) {
        var it1 = army1.firstAliveIterator();
        var it2 = army2.firstAliveIterator();

        while (it1.hasNext() && it2.hasNext()) {
            fight(it1.next(), it2.next());
        }
        return it1.hasNext();
    }

    public static boolean straight_fight(Army army1, Army army2) {
        while (army1.firstAliveIterator() != null && army2.firstAliveIterator() != null) {
            var it1 = army1.firstAliveIterator();
            var it2 = army2.firstAliveIterator();
            while (it1.hasNext() && it2.hasNext()) {
                fight(it1.next(), it2.next());
            }
        }
        return army1.firstAliveIterator() != null;
    }
}