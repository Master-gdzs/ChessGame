package piece;

public class CreatePieces {

    public void createWhite(){
        King kingWhite = new King(new Spot("d",1),1, ColorPiece.White);
        System.out.println(kingWhite);
        Queen queenWhite = new Queen(new Spot("e", 1),2, ColorPiece.White);
        System.out.println(queenWhite);
        Bishop bishopW1 = new Bishop(new Spot("c",1),3, ColorPiece.White);
        System.out.println(bishopW1);
        Bishop bishopW2 = new Bishop(new Spot("f",1),4, ColorPiece.White);
        System.out.println(bishopW2);
        Knight knightW1 = new Knight(new Spot("b", 1), 5, ColorPiece.White);
        System.out.println(knightW1);
        Knight knightW2 = new Knight(new Spot("g", 1), 6, ColorPiece.White);
        System.out.println(knightW2);
        Castle castleW2 = new Castle(new Spot("h", 1), 7, ColorPiece.White);
        System.out.println(castleW2);
        Castle castleW1 = new Castle(new Spot("a", 1), 8, ColorPiece.White);
        System.out.println(castleW1);
    }
    public void createBlack(){
        King kingBlack = new King(new Spot("d",8),17, ColorPiece.Black);
        System.out.println(kingBlack);
        Queen queenBlack = new Queen(new Spot("e", 8),18, ColorPiece.Black);
        System.out.println(queenBlack);
        Bishop bishopB1 = new Bishop(new Spot("c",8),19, ColorPiece.Black);
        System.out.println(bishopB1);
        Bishop bishopB2 = new Bishop(new Spot("f",8),20, ColorPiece.Black);
        System.out.println(bishopB2);
        Knight knightB1 = new Knight(new Spot("b", 8), 21, ColorPiece.Black);
        System.out.println(knightB1);
        Knight knightB2 = new Knight(new Spot("g", 8), 22, ColorPiece.Black);
        System.out.println(knightB2);
        Castle castleB2 = new Castle(new Spot("h", 8), 23, ColorPiece.Black);
        System.out.println(castleB2);
        Castle castleB1 = new Castle(new Spot("a", 8), 24, ColorPiece.Black);
        System.out.println(castleB1);
    }
}
