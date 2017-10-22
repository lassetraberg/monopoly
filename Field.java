import java.util.ArrayList;

public class Field {
    private String name;
    private int number;
    private ArrayList<Player> playersOnField;

    public Field(String name, int number){
        this.name = name;
        this.number = number;
        playersOnField = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "[" + this.number + "] " + this.name;
    }

    public void addPlayerToField(Player p){
        playersOnField.add(p);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
