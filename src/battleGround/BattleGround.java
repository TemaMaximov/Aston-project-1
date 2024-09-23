package battleGround;

import classes.Archer;
import classes.Zombie;

public class BattleGround {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(10);
        Archer archer = new Archer("Anton");
        System.out.println("Archer's health: " + archer.getHealth());
        System.out.println("Zombies's health: " + zombie.getHealth());
        archer.attack(zombie);
        System.out.println("Zombies's health left: " + zombie.getHealth());
        zombie.attack(archer);
        System.out.println("Archer's health left: " + archer.getHealth());
    }
}
