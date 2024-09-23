package abstractClasses;

public abstract class Hero extends aCharacter {
    protected String name;
    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }
}
