package org.example.characters;

public class Defender extends UnitInArmy implements HasDefence {
    private final int defence;
    @Override
    public int getDefence() {
        return defence;
    }

    public Defender(Hero warrior, int defence){
        super(warrior);
        this.defence = defence;
    }

    @Override
    public int receiveDamage(int damage) {
        var newDamage = Math.max(damage - getDefence(), 0);
        return super.receiveDamage(newDamage);
    }
}