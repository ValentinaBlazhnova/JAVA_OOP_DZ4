import java.util.Random;

// Класс воин
public abstract class Warrior<T extends Weapon, S extends Shieldable> extends Personage{
protected static Random rnd = new Random();
    protected T weapon; //Оружие
    protected S shieldable; //Щит
    public Warrior(String name, int hp, T weapon, S shieldable) { //конструтор  hp -healthpoint - здоровье
        super(name, hp);
        this.weapon = weapon;
        this.shieldable = shieldable;
    }
    public int harm(){ // Ударил удачно или неудачно нанёс ущерб
        boolean isHit = rnd.nextBoolean(); //Удар, попадание
        int damage = 0; //Повреждение
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    // public int armor(){ // Защитился или нет
    //     boolean isProtection = rnd.nextBoolean(); 
    //     int protection = 0; //защита
    //     if (isProtection){
    //         protection = rnd.nextInt(shield.protection()+1);
    //     }
    //     return protection; 
    // }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Voin \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tVooruzhen: %s", this.weapon))
                .append(String.format("\n\tZashita: %s", this.shieldable));
        return res.toString();
    }
}
