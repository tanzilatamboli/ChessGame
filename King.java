
public class King extends Piece {
    @Override
    public void move(int rank, int file) {
        this.rank = rank;
        this.file = file;
    }

    @Override
    public void capture() {

    }

    @Override
    public String generateMove(String[][] Board) {
        return "King ";
    }
}
