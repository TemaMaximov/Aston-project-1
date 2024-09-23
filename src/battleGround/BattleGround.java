package battleGround;

import classes.Archer;
import classes.Skeleton;
import classes.Zombie;

public class BattleGround {
    public static void main(String[] args) {
        Zombie zombie = new Zombie(10);
        Archer archer = new Archer("Anton");
        Skeleton skeleton = new Skeleton(12);
        System.out.println("Archer's health: " + archer.getHealth());
        System.out.println("Zombies's health: " + zombie.getHealth());
        System.out.println("Skeleton's health: " + skeleton.getHealth());
        archer.attack(zombie);
        System.out.println("Zombies's health left: " + zombie.getHealth());
        zombie.attack(archer);
        System.out.println("Archer's health left: " + archer.getHealth());
        skeleton.attack(archer);
        System.out.println("Archer's health left: " + archer.getHealth());
        archer.attack(skeleton);
        System.out.println("Skeleton's health left: " + zombie.getHealth());
    }
}
