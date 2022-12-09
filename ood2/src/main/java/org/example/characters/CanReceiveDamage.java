package org.example.characters;

public interface CanReceiveDamage extends HasHealth {
    int receiveDamage(int damage);
}