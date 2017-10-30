public class OtherField implements FieldInterface {
    String name;
    int number;

    public OtherField(String name, int number){
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

    @Override
    public String getName() {
        return name;
    }
}
