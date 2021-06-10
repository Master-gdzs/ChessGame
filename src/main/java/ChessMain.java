import java.util.ArrayList;

public class ChessMain {
    public static void main(String[] args) {
        Player player = new Player();
        ArrayList<Player> playerList = player.createPlayer();
        for (Player playerCount : playerList) {
            System.out.println(playerCount);
        }
    }
}
