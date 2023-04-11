public class Knife implements Weapon{ //Нож интерфейс оружие
    @Override
    public int damage() { //урон
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Nozh perochinniy (max.yron %d)", this.damage());
    }
}
