public abstract class Personage {
    private String name;
    private int hp; //hp - здоровье

    public boolean isAlive(){ //Живой или нет
        return hp>0;
    }

    public Personage(String name, int hp) { //конструктор
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void reduceHp (int damage){ //Уменьшение жизней
            this.hp-=damage;
            if (this.hp<0){
                this.hp = 0;
            }
    }
}
