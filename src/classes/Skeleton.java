package classes;

import abstractClasses.Enemy;
import abstractClasses.aCharacter;

public class Skeleton extends Enemy {
    public Skeleton(int health) {
        super(health);
    }
    @Override
    public void attack(aCharacter hero) {
        hero.takeDamage(4);
        System.out.println("Skeleton hit hero");
    }
}
