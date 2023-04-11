public class Bow extends Throwing{ //Лук от метательного оружия
private String name;
    public Bow(int range) { //Конструктор
        super(range);
        this.name = "Lyk";
    }

    @Override
    public int damage() {//Урон
        return 20;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}
