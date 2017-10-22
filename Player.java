import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Field currentField;
    private int laps = 0;
    //private int money;

    public Player (String name){
        this.name = name;
    }

    public Player (String name, Field f){
        this(name);
        setCurrentField(f);
    }

    @Override
    public String toString() {
        return this.name;
    }

    public void setCurrentField(Field f){
        this.currentField = f;
    }

    public Field getCurrentField() {
        return currentField;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    public int getLaps() {
        return laps;
    }
}
