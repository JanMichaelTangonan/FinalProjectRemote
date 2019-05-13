package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variables for choices (Player and Computer)
        int input; // The input of the user for the game
        int gameRestart;//The input of the user depending on if they want to start the game or not
        int choiceOfComputer; // For the randomly generated choice of the user
        choiceOfComputer = (int) (Math.random() * 3);
        int ROCK = 0;
        int PAPER = 1;
        int SCISSORS = 2;

        String[] thePossibleChoices = {"Rock", "Paper", "Scissors"}; // Test for trying out arrays

        // Variables for Results
        int playerScore = 0;
        int computerScore = 0;
        int playerWinOrLose=playerScore=5;
        boolean win = true;

        //Converts the chosen number to the "piece" that is chosen


        boolean continueGame = true;

        while(playerScore!=5 || computerScore!=5) {
            //Whole game
            Scanner choice = new Scanner(System.in);
            System.out.println("Rock, Paper, Scissors, what is your choice? (1 = Rock, 2 = Paper, 3 = Scissors)");
            input = choice.nextInt();


            // Results
            System.out.println("You have chosen " + input);
            System.out.println("The computer has chosen " + choiceOfComputer);


            results(playerWinOrLose, input, choiceOfComputer, playerScore, computerScore);

            if (playerScore == 5) {

                System.out.println("Congratulations, you won the game!");

            } else if (computerScore == 5) {

                System.out.println("You lost, Better luck next time!");

            }

            continueGame=true;



            //Restarts the game

            Scanner gameInput = new Scanner(System.in);
            gameRestart = gameInput.nextInt();
            System.out.println("Would you like to play again? \n " + "1 = Yes \n " +" 2 = No");

            if (gameRestart == 1){


                System.out.println("Go get that computer tiger! ");

            }

            else if(gameRestart==2){

                System.out.println("Thanks for Playing! ");
                break;

            }



        }




        //Test code here

        /*if(input!=choiceOfComputer){

        System.out.println(input + " beats " + choiceOfComputer);
        }

        else {



        }*/


    }

    /*public static String[] choicesInNumbers(String[] choices){

    for(int rock = 0, paper=1, scissors =2){



    }


    }*/





    /* public static String choices(int choice, int rock, int paper, int scissors) {

        switch (choice) {

            case 1:
                System.out.print(rock);

            case 2:
                System.out.println(paper);

            case 3:
                System.out.println(scissors);

            default:
                System.out.println("Invalid input try again");


        return String.valueOf(choice);
        }

        }*/

    public static String results(int outcome, int input, int choiceOfComputer, int playerScore, int computerScore) {

        switch(outcome) {

            case 1:
                if (input == choiceOfComputer) {

                System.out.println("Its a tie! Keep going!");

                break;
                }

            case 2:
                if (input == 1 && choiceOfComputer == 2) {

                System.out.println("Paper beats rock you lose this round!");
                computerScore++;
                break;
                }

            case 3:
            if (input == 1 && choiceOfComputer == 3) {

                System.out.println("Rock beats scissors you win this round!");
                playerScore++;
                break;
                }

            case 4:
            if (input == 2 && choiceOfComputer == 1) {

                System.out.println("Paper beats rock you win this round!");
                playerScore++;
                break;
                }

            case 5:
            if (input == 2 && choiceOfComputer == 3) {

                System.out.println("Scissors beats paper you lose this round!");
                computerScore++;
                break;
                }

            case 6:
            if(input==3 && choiceOfComputer==1){

                System.out.println("Rock beats scissors you lose this round!");
                choiceOfComputer++;
                break;
                }

            case 7:
            if(input==3 && choiceOfComputer==2){

                System.out.println("Scissors beat paper you win this round!");
                playerScore++;
                break;
                }


                }


        return String.valueOf(outcome);
    }



}
