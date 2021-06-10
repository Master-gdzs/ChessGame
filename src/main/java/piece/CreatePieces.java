package piece;

public class CreatePieces {

    public void createKing(){
        King kingWhite = new King(new Spot("d",1),1, ColorPiece.White);
        System.out.println(kingWhite);
    }

}
