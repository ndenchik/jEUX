package SuperJeux;

public class Wolf extends Animal{

    public Wolf(String name, int x, int y) {
        super(name, x, y);
    }

    public Wolf(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
