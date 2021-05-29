package ua.mamedov.module1;

public class Task1 {
    public static void main(String[] args) {
        Chess.printGameRules();
        Chess chess = new Chess(new Converter());
        int knightCell = chess.readUserInputKnight("A", 1);
        Chess.makeUserProgress(knightCell);
        int knightMove = chess.readUserInputMove("B", 3, knightCell);
        Chess.makeUserProgress(knightMove);
    }
}
