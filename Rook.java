
public class Rook extends Piece {
    int rank;
    int file;


    Rook(int rank, int file){
        this.rank = rank;
        this.file = file;

    }
    @Override
    public void move(int rank, int file) {
            this.rank = rank;
            this.file = file;
        }
    }

    @Override
    public void capture() {

    }

    public String generateMove(String [][]Board){
        return "Oumpa Lumpa";
}
