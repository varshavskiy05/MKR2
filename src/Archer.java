public class Archer extends Character {
    public Archer(String name, int x, int y) {
        super(name, 120, 30, x, y);
    }

    @Override
    public void attack(Character target) {
        target.health -= this.attackPower;
        System.out.println(this.name + " shoots an arrow at " + target.name + " for " + this.attackPower + " damage!");
    }

    @Override
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println(this.name + " moves to (" + newX + "," + newY + ")");
    }
}