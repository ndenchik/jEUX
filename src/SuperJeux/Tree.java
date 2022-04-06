package SuperJeux;

public class Tree extends Being {

    public Tree(String name, int x, int y) {
        super(name, x, y);
    }

    public Tree(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public void receiveDamage(int amount) {
        System.out.println("Damage is: " + amount);

    }

    @Override
    public String toString() {
        return "Tree{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
