public class Archer extends Warrior<Throwing, OvalShied>{ //Лучник от воина <метательное оружие> <Овальный щит>
    public Archer(String name, int hp, Throwing weapon, OvalShied getSize) { //Конструктор
        super(name, hp, weapon, getSize);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
