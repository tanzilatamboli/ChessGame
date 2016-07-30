
public class Pawn extends ChessMan {
    @Override
    public void move(int rank, int file) {
        this.rank = rank;
        this.file = file;
    }


    @Override
    public void capture() {

    }

    @Override
    public String generateMoves(String [][]Board){
        return "Pawn";
    }
}
