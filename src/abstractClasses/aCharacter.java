package abstractClasses;

import interfaces.Mortal;

public abstract class aCharacter implements Mortal {
    protected int health;
    public aCharacter(){}
    public aCharacter(int health) {
        this.health = health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public abstract void attack(aCharacter character);
    @Override
    public boolean isAlive() {
        return health > 0;
    }
    @Override
    public void takeDamage(int damage){
        health -= damage;
    }
}
