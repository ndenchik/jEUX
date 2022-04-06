package SuperJeux;

public class Dragon extends Animal{

    private int power;
    private int range;

    public Dragon(String name, int x, int y, int power, int range) {
        super(name, x, y);
        this.power = power;
        this.range = range;
    }

    public Dragon(String name, int x, int y, int maxHealth, int health, double resistance, int power, int range) {
        super(name, x, y, maxHealth, health, resistance);
        this.power = power;
        this.range = range;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", power=" + power +
                ", range=" + range +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


}
