import java.util.Random;

public class Die {
    private Random random;
    private int face;

    public Die(){
        random = new Random();
    }

    /**
     * Returns a random int that describes the face of the die.
     * @return  int the face of the die
     */
    public int roll(){
        return (face = random.nextInt(6) + 1);
    }

    public int getFace() {
        return face;
    }
}
