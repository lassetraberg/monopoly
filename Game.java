public class Game {
    public static void main (String[] args){
        Board board = new Board();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        addPlayerToField(board.getFields()[0], player1);
        addPlayerToField(board.getFields()[0], player2);

        System.out.println(player1);
        System.out.println(player2);
    }

    public static void addPlayerToField(Field f, Player p){
        p.setCurrentField(f);
        f.addPlayerToField(p);
    }

}
