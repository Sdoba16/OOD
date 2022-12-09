package org.example.characters;

public interface CanAttack {
    int getAttack();
    default void hit(CanReceiveDamage creature) {
        creature.receiveDamage(getAttack());
    }
}
