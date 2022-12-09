package org.example.characters;

public class Vampire extends UnitInArmy implements HasVampirism {
        private final int vampirism;

        public Vampire(Hero warrior, int vampirism) {
                super(warrior);
                this.vampirism = vampirism;
        }

        @Override
        public int getVampirism() {
                return vampirism;
        }

        @Override
        public void hit(CanReceiveDamage opponent) {
                var currentVampire = (Hero)GetKernal();
                var vampiredHealth = opponent.receiveDamage(getAttack()) * getVampirism() / 100;
                currentVampire.setHealth(Math.min(vampiredHealth + getHealth(), getMaxHealth()));
        }
}