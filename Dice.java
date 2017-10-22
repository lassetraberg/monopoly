public class Dice {
    private Die firstDie;
    private Die secondDie;

    public Dice() {
        firstDie = new Die();
        secondDie = new Die();
    }

    /**
     * Throws the two dice and returns the face of the dice.
     * Also checks whether the dice showed the same face.
     *
     * @return int the face of the dice.
     */
    public int throwDice() {
        return firstDie.roll() + secondDie.roll();
    }

    public boolean diceIsEqual() {
        return (firstDie.getFace() == secondDie.getFace());
    }

    public Die getFirstDie() {
        return firstDie;
    }

    public Die getSecondDie() {
        return secondDie;
    }
}
