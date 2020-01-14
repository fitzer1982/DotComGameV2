package com.fitzer.java;

import java.io.*;
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException " + e );}
        return inputLine;
    }
}
