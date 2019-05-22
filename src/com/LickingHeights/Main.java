package com.LickingHeights;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Variables for choices (Player and Computer)
        int input; // The input of the user for the game
        int gameRestart;//The input of the user depending on if they want to start the game or not
        int choiceOfComputer; // For the randomly generated choice of the user

        // Variables for Results
        int playerScore = 0; // The score of the player/user
        int computerScore = 0; // The score of the computer


        // Choices for both player and computer
        String choices[] = new String[3];
        choices[0] = "Rock";
        choices[1] = "Paper";
        choices[2] = "Scissors";


        // Core game

        do {
            choiceOfComputer = new Random().nextInt(choices.length);// This is how the computer picks its choice, it is random.

            Scanner choice = new Scanner(System.in);
            System.out.println("Rock, Paper, Scissors what is your choice? (0 = Rock, 1 = Paper, 2 = Scissors)");
            input = choice.nextInt();// This is where the user gets prompted to enter his/her choice.

            // Round Results
            System.out.println("You have chosen " + choices[input]);
            System.out.println("The computer has chosen " + choices[choiceOfComputer]);


            // Results for a tie
            if (input == choiceOfComputer) {

                System.out.println("Its a tie! Keep going!");
            }

            // Results

            //Player wins round
            playerScore = playerWins(input, choiceOfComputer, playerScore);

            // Computer wins round
            computerScore = computerWins(input, choiceOfComputer, computerScore);

            // Current scores
            System.out.println("The current scores are as follows");
            System.out.println("Your score is " + playerScore + "/10");
            System.out.println("The computer's score is " + computerScore + "/10");
            System.out.println("");

            // To break the loop of the game
            if (playerScore == 10 || computerScore == 10) {

                break;

            }


        } while (playerScore != 10 || computerScore != 10);


        // Final result

        if (playerScore == 10) {

            System.out.println("Congratulations, you won the game!");
            System.out.println("");

        } else if (computerScore == 10) {

            System.out.println("You lost, Better luck next time!");
            System.out.println("");
        }

        do {
            Scanner gameInput = new Scanner(System.in);
            System.out.println("Would you like to play again? \n " + "1 = Yes \n " + "2 = No");
            gameRestart = gameInput.nextInt();

            if (gameRestart == 1) {
                System.out.println("Go get that computer tiger! ");
                System.out.println("");
                main(null);


            } else if (gameRestart == 2) {
                System.out.println("Thanks for Playing! ");
                break;
            } else if (gameRestart != 1 && gameRestart != 2) {

                System.out.println("You either mistyped the number, or you're just a straight up troll, either way get better at type properly!");
                System.out.println("");

            }

        } while (playerScore == 10 || computerScore == 10);


    }

    public static int playerWins(int input, int choiceOfComputer, int playerScore) {

        if (input == 0 && choiceOfComputer == 2) {

            System.out.println("Rock beats scissors you win this round!");
            playerScore++;


        } else if (input == 1 && choiceOfComputer == 0) {

            System.out.println("Paper beats rock you win this round!");
            playerScore++;


        } else if (input == 2 && choiceOfComputer == 1) {

            System.out.println("Scissors beat paper you win this round!");
            playerScore++;


        }

        return playerScore;

    }


    public static int computerWins(int input, int choiceOfComputer, int computerScore) {

        if (input == 0 && choiceOfComputer == 1) {

            System.out.println("Paper beats rock you lose this round!");
            computerScore++;


        } else if (input == 1 && choiceOfComputer == 2) {

            System.out.println("Scissors beats paper you lose this round!");
            computerScore++;


        } else if (input == 2 && choiceOfComputer == 0) {

            System.out.println("Rock beats scissors you lose this round!");
            computerScore++;


        }


        return computerScore;

    }


}
