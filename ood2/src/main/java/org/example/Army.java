package org.example;

import org.example.characters.UnitInArmy;

import java.util.*;
import java.util.function.Supplier;

public class Army {
    private Collection<UnitInArmy> troops = new ArrayList<>();
    private UnitInArmy last;
    public Iterator<UnitInArmy> firstAliveIterator() {
        return new FirstAliveIterator();
    }
    private class FirstAliveIterator implements Iterator<UnitInArmy>{
        private Iterator<UnitInArmy> it = troops.iterator();
        private UnitInArmy champion;

        @Override
        public boolean hasNext() {
            if (champion != null && champion.isAlive()) {
                return true;
            }
            while (it.hasNext()) {
                champion = it.next();
                if (champion.isAlive()) return true;
            }
            return false;
        }
        @Override
        public UnitInArmy next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return champion;
        }
    }
    public Army addUnits(UnitInArmy hero) {
        if (last != null) {
            last.setWarriorBehind(hero);
        }
        troops.add(hero);
        last = hero;
        return this;
    }
    public Army addUnits(Supplier<UnitInArmy> factory, int quantity) {
        for(int i=0; i<quantity;i++){
            addUnits(factory.get());
        }
        return this;
    }

}