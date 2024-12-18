public class Mage extends Character {
    public Mage(String name, int x, int y) {
        super(name, 100, 40, x, y);
    }

    @Override
    public void attack(Character target) {
        target.health -= this.attackPower;
        System.out.println(this.name + " casts a spell on " + target.name + " for " + this.attackPower + " damage!");
    }

    @Override
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println(this.name + " moves to (" + newX + "," + newY + ")");
    }
}