package SuperJeux;

public class Eagle extends Animal{

    public int vision;

    public Eagle(String name, int x, int y, int vision) {
        super(name, x, y);
        this.vision = vision;
    }

    public Eagle(String name, int x, int y, int maxHealth, int health, double resistance, int vision) {
        super(name, x, y, maxHealth, health, resistance);
        this.vision = vision;
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", vision=" + vision +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
