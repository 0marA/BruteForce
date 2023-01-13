import java.util.Scanner;

public class RPS {
    static Scanner scanner;
    static boolean won = false;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        while (won != true) {
            if (game() == -1)
                game();
            else
                break;
        }

        scanner.close();

    }

    public static int game() {
        System.out.print("Pick Rock, Paper, or Scissors: ");
        String input = scanner.nextLine();
        String computerPick = getComputerPick();
        if (input.toLowerCase().equals("rock") || input.toLowerCase().equals("scissors")
                || input.toLowerCase().equals("paper")) {

            if (input.toLowerCase().equals("rock")) {
                if (computerPick.equals("paper")) {
                    System.out.println("You Lost!");
                    return -1;
                } else if (computerPick.equals("scissors")) {
                    System.out.println("You Win!");
                    won = true;
                    return 1;
                } else {
                    System.out.println("Tie!");
                    return -1;
                }
            } else if (input.toLowerCase().equals("paper")) {
                if (computerPick.equals("scissors")) {
                    System.out.println("You Lost!");
                    return -1;
                } else if (computerPick.equals("rock")) {
                    System.out.println("You Win!");
                    won = true;
                    return 1;
                } else {
                    System.out.println("Tie!");
                    return -1;
                }

            } else if (input.toLowerCase().equals("scissors")) {
                if (computerPick.equals("rock")) {
                    System.out.println("You Lost!");
                    return -1;
                } else if (computerPick.equals("paper")) {
                    System.out.println("You Win!");
                    won = true;
                    return 1;
                } else {
                    System.out.println("Tie!");
                    return -1;
                }
            } else
                return -1;

        } else {
            System.out.println("Please pick rock, paper, or scissors");
            return -1;
        }

    }

    public static String getComputerPick() {
        int randomNum = (int) (Math.random() * 10);

        if (3 >= randomNum)
            return "rock";
        else if (6 >= randomNum && randomNum > 3)
            return "paper";
        else
            return "scissors";
    }
}
