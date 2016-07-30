
abstract public class ChessMan {
    int rank; //row
    int file; //column

    public abstract boolean isAlive();

    public abstract String generateMove(String [][]Board);
}
