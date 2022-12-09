package org.example.characters;

public class Healer extends UnitInArmy implements CanHeal {
    private final int healingPower;
    @Override
    public int getHealingPower() {return healingPower;}
    public Healer(Hero hero, int healingPower) {
        super(hero);
        this.healingPower = healingPower;
    }

    @Override
    public void heal(HasHealth creature) {
        creature.setHealth(Math.max(creature.getHealth() + healingPower, creature.getMaxHealth()));
    }
}