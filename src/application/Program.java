package application;

import boardgame.Board;
import chess.ChessMatch;

public class Program {

    public static void main(String[] args){

       // System.out.println("Hello world");

        Board board = new Board(8,8);

        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getPieces());

    }


}
