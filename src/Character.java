public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int x, y;

    public Character(String name, int health, int attackPower, int x, int y) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.x = x;
        this.y = y;
    }

    public abstract void attack(Character target);
    public abstract void move(int newX, int newY);
}
