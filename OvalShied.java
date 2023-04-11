public class OvalShied extends Shield{

    public OvalShied(String size) {
        super(size);
    }

    @Override
    public int protection() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Shit ovalniy: zacshita: %d", this.protection()); 
    } 
    
}
