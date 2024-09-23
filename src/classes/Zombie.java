package classes;

import abstractClasses.aCharacter;
import abstractClasses.Enemy;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }
    @Override
    public void attack(aCharacter hero) {
        hero.takeDamage(5);
        System.out.println("Zombie bit a hero");
    }
}
