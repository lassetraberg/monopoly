public class Field {
    private String name;
    private int number;

    public Field(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "[" + this.number + "] " + this.name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
