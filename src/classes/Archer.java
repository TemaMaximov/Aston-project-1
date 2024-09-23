package classes;

import abstractClasses.aCharacter;
import abstractClasses.Hero;

public class Archer extends Hero {
    public Archer(String name) {
        super(name, 50);
    }
    @Override
    public void attack(aCharacter enemy) {
        enemy.takeDamage(3);
        System.out.println(name + " shot enemy");
    }
}
