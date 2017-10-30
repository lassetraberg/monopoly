import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Board board;
    private Dice dice;
    private List<Player> players;

    public Game(){
        board = new Board();
        dice = new Dice();
        players = new ArrayList<>();
        players.add(new Player("Player1", board.getFields()[0]));
        players.add(new Player("Player2",board.getFields()[0]));
        for(Player p : players){
            int i = 0;
            placePlayerOnField(p, i);
            i++;
        }
    }

    public void play(){
        printWelcome();
        Player winner = null;
        boolean finished = false;
        Scanner input = new Scanner(System.in);
        do{
            for(Player p : players){
                System.out.print(p + ", press any key to throw dice!");
                input.next();
                movePlayer(p, dice.throwDice());
                System.out.println("You threw " + (dice.getFirstDie().getFace() + dice.getSecondDie().getFace()) + ": ");
                printDice(dice.getFirstDie().getFace(),dice.getSecondDie().getFace());
                System.out.println(p + " is now standing at " + p.getCurrentField() + "\n");

            }
        } while(!finished);
        System.out.println(winner + " wins the game!");
    }

    public void placePlayerOnField(Player p, int i){
        p.getCurrentField().getPlayersOnField().remove(p);
        Field f = board.getFields()[i];
        p.setCurrentField(f);
        f.addPlayerToField(p);
    }

    public void movePlayer(Player p, int steps){
        int currentPosition = p.getCurrentField().getNumber() - 1;
        if (currentPosition + steps >= 40){
            placePlayerOnField(p, steps - (40 - currentPosition));
            p.increaseMoney(MonopolyConstants.PASSING_START);
        } else{
            placePlayerOnField(p, currentPosition + steps);
        }
    }

    public static void printWelcome(){
        System.out.println("   WELCOME TO   ");
        System.out.println("*|¯¯¯¯¯¯¯¯¯¯¯¯|*");
        System.out.println("*|  MONOPOLY  |*");
        System.out.println("*|____________|*");
        System.out.println("****************");
        System.out.println("The first player to complete 2 laps around the board wins!");
        System.out.println("");
    }

    public static void printDice(int face1, int face2){
        int[] faces = {face1, face2};
        String die;
        StringBuilder sb = new StringBuilder();
        for(int face : faces){
            switch(face){
                case 1: {
                    die = " _____\n" +
                            "|     |\n" +
                            "|  •  |\n" +
                            "|     |\n" +
                            "¯¯¯¯¯¯¯\n";
                    sb.append(die);
                    break;
                }
                case 2: {
                    die = " _____\n" +
                            "|•    |\n" +
                            "|     |\n" +
                            "|    •|\n" +
                            "¯¯¯¯¯¯¯\n";
                    sb.append(die);
                    break;
                }
                case 3: {
                    die = " _____\n" +
                            "|•    |\n" +
                            "|  •  |\n" +
                            "|    •|\n" +
                            "¯¯¯¯¯¯¯\n";
                    sb.append(die);
                    break;
                }
                case 4: {
                    die = " _____\n" +
                            "|•   •|\n" +
                            "|    |\n" +
                            "|•   •|\n" +
                            "¯¯¯¯¯¯\n";
                    sb.append(die);
                    break;
                }
                case 5: {
                    die = " _____\n" +
                            "|•   •|\n" +
                            "|  •  |\n" +
                            "|•   •|\n" +
                            "¯¯¯¯¯¯\n";
                    sb.append(die);
                    break;
                }
                case 6: {
                    die = " _____\n" +
                            "|•   •|\n" +
                            "|•   •|\n" +
                            "|•   •|\n" +
                            "¯¯¯¯¯¯\n";
                    sb.append(die);
                    break;
                }
                default: break;

            }
        }

        String[] lines = sb.toString().split("\n");
        sb = new StringBuilder();

        for(int i = 0; i < lines.length/2; i++){
            sb.append(lines[i]).append("\t").append(lines[i+5]).append("\n");
        }

        sb.setLength(sb.length()-1);

        System.out.println(sb.toString());
    }

}
