public abstract class OwnableField implements FieldInterface {
    private String name;
    private int number;
    private int price;
    private Player owner = null;


    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Player getOwner() {
        return owner;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
