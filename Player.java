import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private Field currentField;
    private int money;
    private List<OwnableField> ownedFields;

    public Player (String name){
        this.name = name;
    }

    public Player (String name, Field f){
        this(name);
        setCurrentField(f);
        this.money = MonopolyConstants.START_MONEY;
        ownedFields = new ArrayList<>();
    }

    public void buy(OwnableField o){
        pay(o.getPrice());
        ownedFields.add(o);
    }

    public void increaseMoney(int amount){
        this.money =+ amount;
    }

    public void decreaseMoney(int amount){
        this.money =- Math.max(0, this.money =- amount);
    }

    public boolean pay(int amount){
        if((this.money - amount) >= 0){
            decreaseMoney(amount);
            return true;
        } else{
            return false;
        }
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

}
