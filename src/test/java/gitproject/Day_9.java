package gitproject;

import java.util.Scanner;
import java.util.Random;


public class Day_9 {
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock,1 for paper,2 for scissor");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user choice");
        int userInput = sc.nextInt();
        Random rd = new Random();
        int computerInput = rd.nextInt(3);
        if(userInput == computerInput){
            System.out.println("Game is draw");
        }
        else if(userInput == 0 && computerInput == 2 ||userInput == 1 && computerInput == 0||
        userInput == 2 && computerInput == 1){
            System.out.println("You win");
        }
        else{
            System.out.println("Computer win!");
        }
        if(computerInput == 0) {
            System.out.println("computer choice: Rock");
        }
        else if(computerInput == 1) {
            System.out.println("computer choice: paper");
        }
        else if(computerInput == 2) {
            System.out.println("computer choice: scissors");
        }
    }
}

