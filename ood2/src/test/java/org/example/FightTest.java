package org.example;

import org.example.characters.UnitInArmy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.example.characters.Hero;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FightTest {
    @Test
    @DisplayName("1. Fight")
    void Fight1() {
        var carl = new UnitInArmy(Hero.newWarrior());
        var jim = new UnitInArmy(Hero.newKnight());

        assertFalse(Battle.fight(carl, jim));
    }

    @Test
    @DisplayName("2. Fight")
    void Fight2() {
        var ramon = new UnitInArmy(Hero.newKnight());
        var slevin = new UnitInArmy(Hero.newWarrior());

        assertTrue(Battle.fight(ramon, slevin));
    }

    @Test
    @DisplayName("3. Fight")
    void Fight3() {
        var bob = new UnitInArmy(Hero.newWarrior());
        var mars = new UnitInArmy(Hero.newWarrior());
        Battle.fight(bob, mars);

        assertTrue(bob.isAlive());
    }

    @Test
    @DisplayName("4. Fight")
    void Fight4() {
        var zeus = new UnitInArmy(Hero.newKnight());
        var godkiller = new UnitInArmy(Hero.newWarrior());
        Battle.fight(zeus, godkiller);

        assertTrue(zeus.isAlive());
    }

    @Test
    @DisplayName("5. Fight")
    void Fight5() {
        var husband = new UnitInArmy(Hero.newWarrior());
        var wife = new UnitInArmy(Hero.newWarrior());
        Battle.fight(husband, wife);

        assertFalse(wife.isAlive());
    }

    @Test
    @DisplayName("6. Fight")
    void Fight6() {
        var dragon = new UnitInArmy(Hero.newWarrior());
        var knight = new UnitInArmy(Hero.newKnight());
        Battle.fight(dragon, knight);

        assertTrue(knight.isAlive());
    }

    @Test
    @DisplayName("7. Fight")
    void Fight7() {
        var unit_1 = new UnitInArmy(Hero.newWarrior());
        var unit_2 = new UnitInArmy(Hero.newKnight());
        var unit_3 = new UnitInArmy(Hero.newWarrior());
        Battle.fight(unit_1, unit_2);

        assertFalse(Battle.fight(unit_2, unit_3));
    }

    @Test
    @DisplayName("1. Battle")
    void Battle1() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 1);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 2);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("2. Battle")
    void Battle2() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 2);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 3);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("3. Battle")
    void Battle3() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 5);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 7);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("4. Battle")
    void Battle4() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 20);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 21);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("5. Battle")
    void Battle5() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 10);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 11);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("6. Battle")
    void Battle6() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 11);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 7);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("7. Battle")
    void Battle7() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 5);
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 5);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("8. Battle")
    void Battle8() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 5);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 20);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 21);

        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("9. Battle")
    void Battle9() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 10);
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 5);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 5);

        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 10);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("10. Battle")
    void Battle10() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 2);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 1);
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 1);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 5);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("11. Battle")
    void Battle11() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 5);
        army_1.addUnits(() -> new UnitInArmy(Hero.newVampire()), 6);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 7);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 6);
        army_2.addUnits(() -> new UnitInArmy(Hero.newDefender()), 6);
        army_2.addUnits(() -> new UnitInArmy(Hero.newVampire()), 6);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("12. Battle")
    void Battle12() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 2);
        army_1.addUnits(() -> new UnitInArmy(Hero.newVampire()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newVampire()), 3);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("13. Battle")
    void Battle13() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 11);
        army_1.addUnits(() -> new UnitInArmy(Hero.newVampire()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newVampire()), 13);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("14. Battle")
    void Battle14() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 9);
        army_1.addUnits(() -> new UnitInArmy(Hero.newVampire()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 8);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newVampire()), 13);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("15. Battle")
    void Battle15() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newLancer()), 5);
        army_1.addUnits(() -> new UnitInArmy(Hero.newVampire()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 2);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newVampire()), 6);
        army_2.addUnits(() -> new UnitInArmy(Hero.newLancer()), 5);

        assertFalse(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("16. Battle")
    void Battle16() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newLancer()), 7);
        army_1.addUnits(() -> new UnitInArmy(Hero.newVampire()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_1.addUnits(() -> new UnitInArmy(Hero.newDefender()), 2);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newVampire()), 6);
        army_2.addUnits(() -> new UnitInArmy(Hero.newLancer()), 5);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("17. Battle")
    void Battle17() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newLancer()), 7);
        army_1.addUnits(() ->  new UnitInArmy(Hero.newVampire()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newHealer()), 1);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_1.addUnits(() -> new UnitInArmy(Hero.newHealer()), 1);
        army_1.addUnits(() ->  new UnitInArmy(Hero.newDefender()), 2);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() ->  new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newHealer()), 1);
        army_2.addUnits(() ->  new UnitInArmy(Hero.newVampire()), 6);
        army_2.addUnits(() -> new UnitInArmy(Hero.newLancer()), 4);

        assertTrue(Battle.fight(army_1, army_2));
    }

    @Test
    @DisplayName("18. Battle")
    void Battle18() {
        var army_1 = new Army();
        var army_2 = new Army();
        army_1.addUnits(() -> new UnitInArmy(Hero.newLancer()), 1);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 3);
        army_1.addUnits(() -> new UnitInArmy(Hero.newHealer()), 1);
        army_1.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_1.addUnits(() -> new UnitInArmy(Hero.newHealer()), 1);
        army_1.addUnits(() -> new UnitInArmy(Hero.newKnight()), 2);

        army_2.addUnits(() -> new UnitInArmy(Hero.newWarrior()), 4);
        army_2.addUnits(() ->  new UnitInArmy(Hero.newDefender()), 4);
        army_2.addUnits(() -> new UnitInArmy(Hero.newHealer()), 1);
        army_2.addUnits(() ->  new UnitInArmy(Hero.newVampire()), 6);
        army_2.addUnits(() -> new UnitInArmy(Hero.newLancer()), 4);

        assertFalse(Battle.fight(army_1, army_2));
    }
}