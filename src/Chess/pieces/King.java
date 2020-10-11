package Chess.pieces;

import Chess.ChessPiece;
import Chess.Color;
import bordGames.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
      return "K";
    }
}
