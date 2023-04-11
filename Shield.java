public abstract class Shield implements Shieldable{ //Щит
    private String size;//размер

    public Shield(String size) { //конструктор
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
