package com.LickingHeights;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Variables for choices (Player and Computer)
        int input; // The input of the user for the game
        int gameRestart;//The input of the user depending on if they want to start the game or not
        int choiceOfComputer; // For the randomly generated choice of the user

        // Testing out the for loops here



        // Variables for Results
        int playerScore = 0; // The score of the player/user
        int computerScore = 0; // The score of the computer
        //int playerWinOrLose = 0; // *Supposedly "outcome" of the round must find this for the game to work(This piece of code may be useless...if it is delete it)
        boolean coreGameLoop = true;


         // Computer choice
         String choiceComputer [] = new String [3];
         choiceComputer[0] = "Rock";
         choiceComputer[1] = "Paper";
         choiceComputer[2] = "Scissors";

        
        
        
        // Core game
        while (coreGameLoop) {
            do {
                choiceOfComputer = new Random().nextInt(choiceComputer.length);

                Scanner choice = new Scanner(System.in);
                System.out.println("Rock, Paper, Scissors what is your choice? (0 = Rock, 1 = Paper, 2 = Scissors)");
                input = choice.nextInt();

                // Round Results
                System.out.println("You have chosen " + choices(input));
                System.out.println("The computer has chosen " + choices(choiceOfComputer));


                //results Beginning (Fix when get to school)
                if (input == choiceOfComputer) {

                        System.out.println("Its a tie! Keep going!");
                    }

                else if (input == 0 && choiceOfComputer == 1) {

                        System.out.println("Paper beats rock you lose this round!");
                        computerScore++;
                        
                    }

                
                else if (input == 0 && choiceOfComputer == 1) {

                        System.out.println("Rock beats scissors you win this round!");
                        playerScore++;
                        
                    }


                else if (input == 1 && choiceOfComputer == 0) {

                        System.out.println("Paper beats rock you win this round!");
                        playerScore++;
                        
                    }


                else if (input == 1 && choiceOfComputer == 2) {

                        System.out.println("Scissors beats paper you lose this round!");
                        computerScore++;
                        
                    }


                else if (input == 2 && choiceOfComputer == 0) {

                        System.out.println("Rock beats scissors you lose this round!");
                        choiceOfComputer++;
                        
                    }
        
                else if (input == 3 && choiceOfComputer == 2) {

                        System.out.println("Scissors beat paper you win this round!");
                        playerScore++;
                        
                    }
        
                
                //results End (Fix when get to school)
                

            
            
            } while (playerScore != 10 || computerScore != 10);
        }


        // Final result


        if (playerScore == 10) {

            System.out.println("Congratulations, you won the game!");

        } else if (computerScore == 10) {

            System.out.println("You lost, Better luck next time!");

        }


        //Restarts the game

        do {
            Scanner gameInput = new Scanner(System.in);
            System.out.println("Would you like to play again? \n " + "1 = Yes \n " + " 2 = No");
            gameRestart = gameInput.nextInt();

            if (gameRestart == 1) {


                System.out.println("Go get that computer tiger! ");
                System.out.println(coreGameLoop);

            } else if (gameRestart == 2) {

                System.out.println("Thanks for Playing! ");
                break;

            }
        } while (playerScore == 10 || computerScore == 10);

    }


        //Test code here


        public static String choices(int choice){

            switch (choice) {

                case 0:
                    System.out.println("Rock");

                case 1:
                    System.out.println("Paper");

                case 2:
                    System.out.println("Scissors");

                default:
                    System.out.println("Invalid input try again");



            } return String.valueOf(choice);

        }

        /*public static String results (int outcome, int input, int choiceOfComputer,int playerScore, int computerScore)
        {

            switch (outcome) {

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
                    if (input == 3 && choiceOfComputer == 1) {

                        System.out.println("Rock beats scissors you lose this round!");
                        choiceOfComputer++;
                        break;
                    }

                case 7:
                    if (input == 3 && choiceOfComputer == 2) {

                        System.out.println("Scissors beat paper you win this round!");
                        playerScore++;
                        break;
                    }


            }


            return String.valueOf(outcome);
        }*/


    }
