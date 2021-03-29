package com.company;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String winner = null;
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '-', '-', '-', '-'},
                {' ', '|', ' ', '|', ' '}};
        printGameBoard(gameBoard); //priting empty board

        while(true) {

            Scanner scan = new Scanner(System.in);    //sacns the position player entered but random?

            System.out.println("Enter number to place yourself betn 1-9");
            int playerPos = scan.nextInt(); // asking player to enter some int value

            System.out.println(playerPos);
            place(gameBoard, playerPos, "player"); // does the same output



            Random rand = new Random();
            int player2Pos = rand.nextInt(9) + 1;
            place(gameBoard, player2Pos, "player2");
            
            printGameBoard(gameBoard); //priting  board again, entered number will take the position

        }
    }

    public static void printGameBoard(char[][] gameBoard) { //prints the empty board
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c); //print one next to eachother
            }
            System.out.println(); //to print on new line
        }
    }
    public static void place(char[][] gameBoard, int pos, String user) {
        char symbol = ' ';
        if(user.equals("player")) {
            symbol = 'X';
        } else if(user.equals("player2")) {
            symbol = 'o';
        }

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

}