package SuperJeux;

public abstract class Being extends SpatialElement implements Comparable<Being>{

    private int maxHealth = 100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y) {
        super(name, x, y);
    }

    public Being(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y);
        this.maxHealth = maxHealth;
        this.health = health;
        this.resistance = resistance;
    }

   public abstract void receiveDamage(int amount);

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }

    @Override
    public int compareTo(Being b) {

        if(this.health < b.health){
            return -1;
        }else if(this.health > b.health) {
            return 1;
        }else{
            return 0;
        }

    }

    @Override
    public String toString() {
        return "Being{" +
                "maxHealth=" + maxHealth +
                ", health=" + health +
                ", resistance=" + resistance +
                '}';
    }
}
