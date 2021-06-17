import piece.ColorPiece;
import piece.CreatePieces;

import java.util.ArrayList;

public class Player {
    private String name;
    private String email;
    private ColorPiece color;
    private int age;
    private int rank;

    public Player() {
    }

    private Player(String name, String email, ColorPiece color, int age, int rank) {
        this.name = name;
        this.email = email;
        this.color = color;
        this.age = age;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ColorPiece colorPiece() {
        return color;
    }

    public void setWhite(ColorPiece color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        if (rank < 100 || rank > 3000) {
            throw new IllegalArgumentException("The rank should be in range of 100 to 3000");
        }

        this.rank = rank;
    }

    @Override
    public String toString() {
        return name +
                ", email = " + email + '\'' +
                ", color =" + color +
                ", age = " + age +
                ", rank = " + rank;
    }

    public ArrayList createPlayer() {
        ArrayList<Player> players = new ArrayList();
        players.add(new Player("Beth Harmon", "bethharmon@gmail.com", ColorPiece.White, 2000, 20));
        CreatePieces createPieces = new CreatePieces();
        createPieces.createWhite();
        players.add(new Player("Vasiliy Borgov", "vasiliyborgov@yandex.ru", ColorPiece.Black, 2500, 41));
        createPieces.createBlack();
        return players;
    }
}
