package com.fitzer.java;

public class DotComGame {

    public static void main(String[] args) {
        int numberOfGuesses = 0; // used so you can message the gamer how many times they tried
        GameHelper helper = new GameHelper(); // weird class for getting a user input, nearly sure there is a 100 other easy ways of doing this

        DotCom theDotCom = new DotCom(); // this is where our game logic is, new class

        int randomNum = (int) (Math.random()*5); //created a random number between 1 & 4

        int[] locations = {randomNum, randomNum+1, randomNum+2}; // remaining cells need to be beside the first cell

        theDotCom.setLocationCells(locations); //go to game object and set the locations cells

        boolean isAlive = true; //game is still valid

        while (isAlive == true){
            String guess = helper.getUserInput("enter your guess"); //guess is equal to what the user enters
            String result = theDotCom.checkYourself(guess); //pass guess to checkyourself method and return result
            numberOfGuesses++; //iterate number of guesses for everytime it runs

            if(result.equals("kill")){ //if result is a kill then kill the game
            isAlive = false; //ensures the while statement no longer runs
            System.out.println("You took " + numberOfGuesses + " to get it right");
            }
        }
	// write your code here
    }
}
