public class RoundShied extends Shield{

    public RoundShied(String size) {
        super(size);
    }

    @Override
    public int protection() { //Сколько защиты
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Shit krugliy: zacshita: %d", this.protection()); 
    } 
}
