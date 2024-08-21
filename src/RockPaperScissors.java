import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};
        int playerScore = 0;
        int computerScore = 0;

        Scanner scn = new Scanner(System.in);
         while (true) {
             String computerMove = rps[new Random().nextInt(rps.length)];
             String playerMove;

             while (true) {
                 System.out.print("Please enter your move (rock, paper, or scissors): ");
                 playerMove = scn.nextLine();
                 if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors")) {
                     break;
                 }
                 System.out.println(playerMove + " is not a valid move");
             }
             System.out.println("computer played : " + computerMove);

             if (playerMove.equals(computerMove)) {
                 System.out.println("The game was a tie!");
             } else if (playerMove.equals("rock")) {
                 if (computerMove.equals("paper")) {
                     System.out.println("You Lose!");
                     computerScore++;
                 } else if (computerMove.equals("scissors")) {
                     System.out.println("You Win!");
                     playerScore++;
                 }

             } else if (playerMove.equals("paper")) {
                 if (computerMove.equals("rock")) {
                     System.out.println("You Win!");
                     playerScore++;
                 } else if (computerMove.equals("scissors")) {
                     System.out.println("You Lose!");
                     computerScore++;
                 }
             } else if (playerMove.equals("scissors")) {
                 if (computerMove.equals("paper")) {
                     System.out.println("You Win!");
                     playerScore++;
                 } else if (computerMove.equals("rock")) {
                     System.out.println("You Lose!");
                     computerScore++;
                 }
             }
             System.out.println("Scores:  You " + playerScore + " - " + computerScore + " Computer");
             System.out.print("Do you want to play again? (Yes/No): ");
             String playAgain = scn.nextLine();
             if (!playAgain.equalsIgnoreCase("yes")) {
                 break;
             }
         }
    }
}
