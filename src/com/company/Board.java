package com.company;

import java.util.ArrayList;

public class Board {
    private static ArrayList<ArrayList<ObjTile>> board = new ArrayList<>();

    public static void createBoard(){
        for (int i = 0; i < 4; i++){
            ArrayList<ObjTile> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++){
                String state = getTileState(i,j);
                ObjTile tile = new ObjTile(state,i,j);
                temp.add(tile);
            }
            board.add(temp);
        }
    }

    public static void printBoard(){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("["+board.get(i).get(j).getState()+"]");
            }
            System.out.println();
        }
    }

    public static String getTileState(int x,int y){
        String out = " ";
        if (x == 0){
            if (y == 0){
                out = " ";
            }
            else if (y == 1){
                out = "A";
            }
            else if (y == 2){
                out = "B";
            }
            else{
                out = "C";
            }
        }
        else if (y == 0){
            int out1 = 4-x;
            out = ""+out1;
        }
        else if (x == 1){
            out = "b";
        }
        else if (x == 3){
            out = "w";
        }
        return out;
    }

    public static void Move(String colour){
        boolean valid = false;
        String piece = "";
        while (!valid){
            System.out.println("Enter co-ordinate of the piece you want to move");
            piece = Main.InputString();
            if (piece.charAt(0) != 'A' ||piece.charAt(0) != 'B' ||piece.charAt(0) != 'C'){
                System.out.println("please enter a valid position (e.g. A1");
            }
            else if (piece.charAt(1) != '1' || piece.charAt(1) != '2' || piece.charAt(1) != '3'){
                System.out.println("please enter a valid position (e.g. A1");
            }
            else if (!coord(piece).getState().equals(colour)){
                System.out.println("please pick one of your pieces");
            }
            else{
                valid = true;
            }
        }
        valid = false;
        String move = "";
        while (!valid){
            System.out.println("Enter the co-ordinate of the tile you want to move to");
            move = Main.InputString();
            if (piece.charAt(0) != 'A' ||piece.charAt(0) != 'B' ||piece.charAt(0) != 'C'){
                System.out.println("please enter a valid position (e.g. A1");
            }
            else if (piece.charAt(1) != '1' || piece.charAt(1) != '2' || piece.charAt(1) != '3'){
                System.out.println("please enter a valid position (e.g. A1");
            }
            else if (!validMove()){

            }
            else{
                valid = true;
            }
        }
    }

    public static ObjTile coord(String coord){
        char x = coord.charAt(0);
        char y = coord.charAt(1);
        int xout = -1;
        int yout = -1;
        if (x == 3){
            xout = 1;
        }
        else if (x == 2){
            xout = 2;
        }
        else{
            xout = 3;
        }
        if (y == 'A'){
            yout = 1;
        }
        else if (y == 'B'){
            yout = 2;
        }
        else{
            yout = 3;
        }
        return board.get(yout).get(xout);
    }
}
