package org.example.characters;

interface HasHealth {
    int getHealth();
    void setHealth(int health);
    int getMaxHealth();
    default boolean isAlive() {
        return getHealth() > 0;
    }
}
