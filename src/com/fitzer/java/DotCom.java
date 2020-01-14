package com.fitzer.java;

public class DotCom {
    int[] locationCells; //location of the ship
    int numberOfHits = 0; //how many times has it been hit

    public void setLocationCells(int[] locs){ // method that allows you to take an array and assign it to locationcells
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){ //public method that takes a string
        int guess = Integer.parseInt(stringGuess); //it then converts the string to an int
        String result = "miss"; //string called result

        for (int cell:locationCells){ //iterate through locationcells and assigns the value to cell
            if(guess == cell){ // if guess is equal to cell(which is locationccells content
                result = "hit"; // result is chenged to hit
                numberOfHits++; //increment the number of hits

                break;
            }
        }

        if (numberOfHits == locationCells.length){ //if number of hits matches the legth of our array
            result = "kill"; //change result to kill
        }
        System.out.println(result);
        return result; // returns result
    }

}
