
package com.mycompany.lifegame;

import java.util.Scanner;

public class LifeGame implements PlayerController {

    public static void main(String[] args) {
        LifeGame game = new LifeGame();
        game.startGame();
    }

    public void startGame() {
        System.out.println("Welcome to the Life RPG Game!");
        System.out.println("Instructions: Use 'W', 'A', 'S', 'D' keys to move (Up, Left, Down, Right). Press 'Q' to quit.");

        Scanner scanner = new Scanner(System.in);
        char input;

        while (true) {
            input = scanner.next().charAt(0);

            switch (input) {
                case 'W':
                case 'w':
                    moveUp();
                    break;
                case 'A':
                case 'a':
                    moveLeft();
                    break;
                case 'S':
                case 's':
                    moveDown();
                    break;
                case 'D':
                case 'd':
                    moveRight();
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Thank you for playing! Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Use 'W', 'A', 'S', 'D' keys to move (Up, Left, Down, Right). Press 'Q' to quit.");
            }
        }
    }

    @Override
    public void moveUp() {
        System.out.println("Player moved UP.");
    }

    @Override
    public void moveDown() {
        System.out.println("Player moved DOWN.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Player moved LEFT.");
    }

    @Override
    public void moveRight() {
        System.out.println("Player moved RIGHT.");
    }
}

    

