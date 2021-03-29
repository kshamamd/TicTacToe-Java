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
    }
    public static void printGameBoard(char[][] gameBoard) { //prints the empty board
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c); //print one next to eachother
            }
            System.out.println(); //to print on new line
        }
    }
}