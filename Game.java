public class Game {
    Board board;
    Dice dice;
    Player player1;
    Player player2;

    public Game(){
        board = new Board();
        dice = new Dice();
        player1 = new Player("Player1");
        player2 = new Player("Player2");
        placePlayerOnField(player1, board.getFields()[0]);
        placePlayerOnField(player1, board.getFields()[0]);
    }

    public void play(){
        printWelcome();
        boolean finished = false;
        while(!finished){

        }
    }

    public static void placePlayerOnField(Player p, Field f){
        p.setCurrentField(f);
        f.addPlayerToField(p);
    }

    public static void printWelcome(){
        System.out.println("   WELCOME TO   ");
        System.out.println("*|¯¯¯¯¯¯¯¯¯¯¯¯|*");
        System.out.println("*|  MONOPOLY  |*");
        System.out.println("*|____________|*");
        System.out.println("****************");
    }

}
