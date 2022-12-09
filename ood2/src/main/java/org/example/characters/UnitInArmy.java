package org.example.characters;

public class UnitInArmy implements Hero, HasWarriorBehind {
    private final Hero hero;
    private UnitInArmy behind;
    public UnitInArmy(Hero hero) {
        this.hero = hero;
    }

    public UnitInArmy getWarriorBehind() {
        return behind;
    }
    public void setWarriorBehind(UnitInArmy w) {
        behind = w;
    }

    public Hero GetKernal() {
        if(hero instanceof UnitInArmy) return GetKernal();
        else return hero;
    }
    @Override
    public int getAttack() {
        return hero.getAttack();
    }
    @Override
    public int getHealth() {
        return hero.getHealth();
    }
    public int getMaxHealth() {
        return hero.getMaxHealth();
    }
    @Override
    public void setHealth(int health) {hero.setHealth(health);}
    @Override
    public boolean isAlive() {
        return hero.isAlive();
    }
    @Override
    public void hit(CanReceiveDamage opponent) {
        hero.hit(opponent);
        if (hero instanceof HasWarriorBehind) {
            var hero2 = ((HasWarriorBehind) hero).getWarriorBehind();
            if (hero2 instanceof CanHeal) {
                ((CanHeal) hero2).heal(hero);
            }
        }
    }
    @Override
    public int receiveDamage(int damage) {
        return hero.receiveDamage(damage);
    }
}