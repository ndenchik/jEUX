package SuperJeux;

import java.util.ArrayList;

public abstract class Humanoid extends Being{

    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<House> houses = new ArrayList<>();


    public Humanoid(String name, int x, int y, ArrayList<Animal> animals, ArrayList<House> houses) {
        super(name, x, y);
        this.animals = animals;
        this.houses = houses;
    }

    public Humanoid(String name, int x, int y, int maxHealth, int health, double resistance, ArrayList<Animal> animals, ArrayList<House> houses) {
        super(name, x, y, maxHealth, health, resistance);
        this.animals = animals;
        this.houses = houses;
    }

    @Override
    public void receiveDamage(int amount) {
        System.out.println("Damage is: " + amount);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", animals=" + animals +
                ", houses=" + houses +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
