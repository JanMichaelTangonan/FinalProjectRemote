package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Variables
        String input; // For the input of the user
        int choiceOfComputer; // For the randomly generated choice of the user
        int ROCK = 1;
        int PAPER = 2;
        int SCISSORS = 3;

        choiceOfComputer = (int) (Math.random() * 3);


        boolean restart = true;

        //Whole game
        Scanner choice = new Scanner(System.in);
        System.out.println("Rock, Paper, Scissors, what is your choice? ");
        input = choice.nextLine();
        System.out.println(input.toUpperCase());

        // Results
        System.out.println("You have chosen " + input);
        System.out.println("The computer has chosen " + choiceOfComputer);


        //Test code here
        String[] thePossibleChoices = {"Rock", "Paper", "Scissors"}; // Test for trying out arrays

        /*if(input!=choiceOfComputer){

        System.out.println(input + " beats " + choiceOfComputer);
        }

        else {



        }*/


    }

    public static String choices(String choice, String rock, String paper, String scissors) {

        switch (choice) {

            case rock:
                System.out.print("ROCK");

            case paper:
                System.out.println("PAPER");

            case scissors:
                System.out.println("SCISSORS");

            default:
                System.out.println("Invalid input try again");


        return choice;
        }

        }

    public static String results() {


    }


    public static int calculations() {


    }


}
