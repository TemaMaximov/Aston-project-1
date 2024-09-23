package classes;

import abstractClasses.Hero;
import abstractClasses.aCharacter;

public class Mage extends Hero {
    public Mage(String name) {
        super(name, 50);
    }
    @Override
    public void attack(aCharacter enemy) {
        enemy.takeDamage(5);
        System.out.println(name + " cursed enemy");
    }
}
