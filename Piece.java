
abstract public class Piece extends ChessMan {

    abstract public void move(int rank,int file);

    abstract public void capture();

    abstract public String generateMove(String [][]Board);


}
