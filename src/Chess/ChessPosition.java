package Chess;


import bordGames.Position;

public class ChessPosition {
    private char column;
    private char row;

    public ChessPosition(char column, char row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Erro ao instanciar chessPosition: valorores invalidos 'a1-h8'");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public char getRow() {
        return row;
    }

    protected Position ToPosition() {
        return new Position(8 - row,column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), (char)(8 - position.getRow()));
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
