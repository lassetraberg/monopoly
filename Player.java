public class Player {
    private String name;
    private Field currentField;
    //private int money;

    public Player (String name){
        this.name = name;
    }

    public void move (Dice die){

    }

    @Override
    public String toString() {
        return this.name + " is on the current field " + currentField;
    }

    public void setCurrentField(Field f){
        this.currentField = f;
    }

}
