package classes;

import abstractClasses.Hero;
import abstractClasses.aCharacter;

public class Warrior extends Hero {
    @Override
    public void attack(aCharacter enemy) {
        enemy.takeDamage(5);
        System.out.println(name + " hitted enemy");
    }

    public Warrior(String name) {
        super(name, 50);
    }
}
