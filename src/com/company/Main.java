package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Board.createBoard();
        Board.printBoard();
    }

    public static String InputString(){
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String out = "";
        while(!valid){
            try{
                out = input.next();
                valid = true;
            }
            catch (Exception e){
                System.out.println("Error "+e);
                input.next();
            }
        }
        return out;
    }
}
