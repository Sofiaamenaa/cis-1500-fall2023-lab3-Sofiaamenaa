package Lab3;

import java.util.Random;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Random game = new Random();
        String computerName = "";
        String option = "Y";
        while (option.equals("Y")) {
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

                System.out.print("Enter your choice (rock, paper, scissors, lizard, or spock): ");
                String userChoice = scanner.nextLine().toLowerCase();
                for (String choice : choices) {
                    if (choice.equalsIgnoreCaseUserChoice) {
                        correctchoice = true;
                    }
                }
                while (correctchoice == false) {
                    System.out.print("Invalid choice. Please enter a valid choice: ");
                    userChoice = scanner.nextLine().toLowerCase();
                    for (String choice : choices) {
                        if (choice.equalsIgnoreCase(userChoice)) {
                            correctchoice = true;
                        }
                    }
                }
                int computerChoiceIndex = (int)
                        (Math.random() * choices.length);
                String computerChoice = choices[computerChoiceIndex];
                System.out.println("You chose: " + userChoice);
                System.out.println("Computer chose: " + computerChoice);
                if (userChoice.equals(computerChoice)) {
                    System.out.println("It's a draw!");
                } else {
                    switch (userChoice) {
                        case "rock":
                            if (computerChoice.equals("scissors") || computerChoice.equals("lizard")) {
                                System.out.println("you win");
                            }
                            break;
                        case "paper":
                            if (computerChoice.equals("rock") || computerChoice.equals("spock")) {
                                System.out.println("you win");
                            }
                            ;
                        case "scissors":
                            if (computerChoice.equals("paper") || computerChoice.equals("lizard")) {
                                System.out.println("you win");
                            }
                            break;
                        case "lizard":
                            if (computerChoice.equals("spock") || computerChoice.equals("paper")) {
                                System.out.println("you win");
                            }
                            break;
                        case "spock":
                            if (computerChoice.equals("rock") || computerChoice.equals("scissors")) {
                                System.out.println("you win");
                            }
                            break;
                        default:
                            System.out.println("you lose");
                            break;
                    }
                }
                System.out.println("Computer chose " + computerName);
                System.out.println("Do you want to play again?");
                option = keyboard.nextLine();
            }
        }
    }
}


