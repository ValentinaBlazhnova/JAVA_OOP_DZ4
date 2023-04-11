public abstract class Throwing implements Weapon{ //Метательное оружие
    int range; //Дальность, расстояние

    public Throwing(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }

    @Override
    public String toString() {
        return String.format("Metatelnoe. Yron: %d. Rasstoyanie: %d", damage(), getRange());
    }
}
