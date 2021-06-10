package piece;

public abstract class Piece {
    private NamePiece name;
    private Spot spot;
    private int id;
    private ColorPiece colorPiece;
    private boolean life;

    public Piece(NamePiece name, Spot spot, int id, ColorPiece colorPiece) {
        this.name = name;
        this.spot = spot;
        this.id = id;
        this.colorPiece = colorPiece;
        this.life = true;
    }

    public NamePiece getName() {
        return name;
    }

    public Spot getSpot() {
        return spot;
    }

    public int getId() {
        return id;
    }

    public ColorPiece getColorPiece() {
        return colorPiece;
    }

    public boolean isLife() {
        return life;
    }

    public void setSpot(Spot spot) {
        this.spot = spot;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return name +
                ", spot = " + spot +
                ", id = " + id +
                ", colorPiece = " + colorPiece +
                ", life = " + life;
    }
}
