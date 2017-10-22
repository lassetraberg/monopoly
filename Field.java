import java.util.ArrayList;
import java.util.List;

public class Field {
    private String name;
    private int number;
    private List<Player> playersOnField;

    public Field(String name, int number){
        this.name = name;
        this.number = number;
        playersOnField = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name + " (" + this.number + ")";
    }

    public void addPlayerToField(Player p){
        playersOnField.add(p);
    }

    public List<Player> getPlayersOnField() {
        return playersOnField;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
