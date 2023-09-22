package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

        Random game = new Random();
        String computerName = "";
        String option = "Y";
        while(option.equals("Y"))
        {
            int computerChoice = game.nextInt(5) + 1;
            if (computerChoice == 1) {
                computerName = "Rock";
            } else if (computerChoice == 2) {
                computerName = "Paper";
            } else if (computerChoice == 3) {
                computerName = "Scissors";
            } else if (computerChoice == 4) {
                computerName = "Lizard";
            } else if (computerChoice == 5) {
                computerName = "Spock";
            }
            System.out.println("Computer chose " + computerName);
            System.out.println("Do you want to play again?");
            option = keyboard.nextLine();
        }

    }
}
