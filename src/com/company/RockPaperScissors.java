package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class RockPaperScissors {

    public static void main(String[] args) {
        Random rand = new Random();

        Scanner input = new Scanner(System.in);
        boolean gameContinue = false;
        int num = 0;
        String playerOne;
        String playerTwo;
        String continuePlaying;
        //Added two types of game modes to give the game variety
        System.out.println("Computer or two player?");
        String gameVersion = input.nextLine();
        //Big if statement used to change between gamemodes
        //Allows the game not to crash when user types different names for the modes
        if (gameVersion.equals("Computer") || gameVersion.equals("C") || gameVersion.equals("computer") || gameVersion.equals("Comp")) {
            do {
                //gameContinue is a boolean variable that handles if the user wants to continue playing later
                gameContinue = false;

                num = rand.nextInt(3) + 1;
                System.out.println("Rock, Paper or Scissors");
                String userInput = input.nextLine();
                //Each if statement shows the different situations that can occur
                if (userInput.equals("Rock") || userInput.equals("r") || userInput.equals("rock")) {
                    if (num == 1) {
                        System.out.println("Player: Rock | Computer: Rock");
                        System.out.println("It's a tie!");
                    } else if (num == 2) {
                        System.out.println("Player: Rock | Computer: Paper");
                        System.out.println("Computer Wins!");
                    } else {
                        System.out.println("Player: Rock | Computer: Scissors");
                        ;
                        System.out.println("Player Wins!");
                    }
                } else if (userInput.equals("Paper") || userInput.equals("paper") || userInput.equals("p")) {
                    if (num == 1) {
                        System.out.println("Player: Paper | Computer: Rock");
                        System.out.println("Player Wins!");
                    } else if (num == 2) {
                        System.out.println("Player: Paper | Computer: Paper");
                        System.out.println("It's a tie!");
                    } else {
                        System.out.println("Player: Paper | Computer: Scissors");
                        System.out.println("Computer Wins!");
                    }
                } else {
                    if (num == 1) {
                        System.out.println("Player: Scissors | Computer: Rock");
                        System.out.println("Computer Wins!");
                    } else if (num == 2) {
                        System.out.println("Player: Scissors | Computer: Paper");
                        System.out.println("Player Wins!");
                    } else {
                        System.out.println("Player: Scissors | Computer: Scissors");
                        System.out.println("It's a tie!");
                    }
                }
                //This is where the program askes the user if he wants to continue
                System.out.println("Do you want to keep playing?");
                continuePlaying = input.nextLine();
                //If the user does, gameContinue becomes true and it loops back to the beginning
                if (continuePlaying.equals("yes") && continuePlaying.equals("y")) {
                    gameContinue = true;
                }
                else {
                    break;
                }
            } while (gameContinue = true);
        } else {
            do {
                gameContinue = false;
                System.out.println("Player one type Rock, Paper or Scissors"); //This is a prompt to get player 1 answer
                playerOne = input.nextLine();
                System.out.println("Player two type Rock, Paper or Scissors"); //This is a prompt to get player 2 answer
                playerTwo = input.nextLine();
                if (playerOne.equals(playerTwo)) {
                    System.out.println("Its a tie");
                } else if (playerOne.equals("Rock") && playerTwo.equals("Paper")) {
                    System.out.println("Player Two wins");
                } else if (playerOne.equals("Paper") && playerTwo.equals("Rock")) {
                    System.out.println("Player One wins");
                } else if (playerOne.equals("Paper") && playerTwo.equals("Scissors")) {
                    System.out.println("Player Two wins");
                }     //This whole group of if statements
                else if (playerOne.equals("Scissors") && playerTwo.equals("Paper")) {
                    System.out.println("Player One wins");
                }     //It goes through the different senerios
                else if (playerOne.equals("Rock") && playerTwo.equals("Scissors")) {
                    System.out.println("Player One wins");
                } else if (playerOne.equals("Scissors") && playerTwo.equals("Rock")) {
                    System.out.println("Player Two wins");
                }
                System.out.println("Do you want to keep playing?");
                continuePlaying = input.nextLine();
                if (continuePlaying.equals("Yes") && continuePlaying.equals("y")) {
                    gameContinue = true;
                }
                else {
                    break;
                }
            } while (gameContinue = true);
        }
    }
}

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Welcome to rock paper scissors. ");
//        System.out.println("You can enter either rock, paper, or scissors.");
//        System.out.println("Try to beat me!");
//        String response = scan.nextLine();
//        final String[] answer = {new String()};
//        int[] int_random = null;
//        class generateRandom {
//            Random ran = new Random();
//            int upperbound = 2;
//            int int_random = ran.nextInt(upperbound);{
//                if (int_random == 0) {answer[0] = "I chose rock";}
//                if (int_random ==1) {answer[1] = "I chose paper";}
//                if (int_random ==2) {answer[2] = "I chose scissors";}
//            }
//        }
