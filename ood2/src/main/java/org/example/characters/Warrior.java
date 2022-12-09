package org.example.characters;

public class Warrior implements Hero {
    private int health;
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public int getHealth() {
        return health;
    }

    private final int maxHealth;
    @Override
    public int getMaxHealth() {
        return maxHealth;
    }

    private final int attack;
    @Override
    public int getAttack() {
        return attack;
    }

    Warrior(int health, int attack) {
        this.health = health;
        this.attack = attack;
        this.maxHealth = health;
    }

    @Override
    public int receiveDamage(int damage) {
        setHealth(getHealth() - damage);
        return damage;
    }
}