package org.example.characters;

public interface Hero extends CanReceiveDamage, CanAttack, HasHealth {
    static Hero newWarrior() {
        return new Warrior(50,5);
    }
    static Hero newKnight() {
        return new Warrior(50, 7);
    }
    static Hero newDefender() {
        return new Defender(new Warrior(60,3), 2);
    }
    static Hero newVampire() {
        return new Vampire(new Warrior(40,4), 50);
    }
    static Hero newLancer() {
        return new Lancer(new Warrior(60,6), 50);
    }
    static Hero newHealer() {
        return new Healer(new Warrior(60,0), 2);
    }
    static Hero newDead() {return new Warrior(0, 0);}
}
