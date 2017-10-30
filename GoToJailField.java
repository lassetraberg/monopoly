public class GoToJailField implements FieldInterface {
    String name;
    int number;

    public GoToJailField(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public void consequence(Player p) {

    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
