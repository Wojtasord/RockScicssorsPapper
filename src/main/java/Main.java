import moves.MovesStrategy;
import moves.Paper;
import moves.Rock;
import moves.Scissors;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSORS");
        MovesStrategy firstPlayer;
        MovesStrategy secondPlayer;
        do {
            firstPlayer =  chooseMove();
        }while (firstPlayer == null);

    }

    private static MovesStrategy chooseMove() {
        System.out.println("Input move (ROCK,PAPER,SCISSORS)");
        Scanner playerInput = new Scanner(System.in);
        String playerMoveName = playerInput.nextLine();
        try{
        switch (playerMoveName.trim().toUpperCase()) {
            case "ROCK":
                return new Rock();
            case "PAPER":
                return new Paper();
            case "SCISSORS":
                return new Scissors();
            default:
                throw new WrongInputException("Wrong input");
        }
        } catch (WrongInputException e) {
            System.out.println("Choose from ROCK, SCISSORS, or PAPER!");

        }
        return null;
    }
}
