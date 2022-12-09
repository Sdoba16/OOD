package org.example.characters;

public class Lancer extends UnitInArmy implements HasPiercingDamage {
    private final int piercingDamage;
    @Override
    public int getPiercingDamage() {
        return piercingDamage;
    }
    public Lancer(Hero warrior, int piercingDamage) {
        super(warrior);
        this.piercingDamage = piercingDamage;
    }


    @Override
    public void hit(CanReceiveDamage opponent) {
        var dealtDamage = opponent.receiveDamage(getAttack());
        if(opponent instanceof HasWarriorBehind) {
            var opponentBehind = ((HasWarriorBehind) opponent).getWarriorBehind();
            if(opponentBehind != null) opponentBehind.receiveDamage(dealtDamage * getPiercingDamage() / 100);
        }
    }
}