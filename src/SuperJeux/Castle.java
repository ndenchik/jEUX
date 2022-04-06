package SuperJeux;

public class Castle extends House{

    public int defense;

    public Castle(String name, int x, int y, int price, Ematerial ematerial, int defense) {
        super(name, x, y, price, ematerial);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "defense=" + defense +
                '}';
    }
}
