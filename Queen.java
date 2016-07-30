
public class Queen extends Piece {


    @Override
    public void move(int rank, int file) {
        this.rank = rank;
        this.file = file;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String generateMove(String[][] Board) {
        return "Queen";
    }

    
}
