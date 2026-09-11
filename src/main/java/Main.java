import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PritheeGame game = new PritheeGame();

        int correct = 0;
        int incorrect = 0;

        while (correct < 3 && incorrect < 3) {

            PritheeGame.Round round = game.createRound();

            System.out.println();
            System.out.println(round.display());
            System.out.println();

            System.out.print("What is the next word? ");
            String guess = scanner.nextLine();

            if (game.isCorrect(guess, round.answer())) {
                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Error!");
                System.out.println("The correct word was: " + round.answer());
                incorrect++;
            }

            System.out.println("Correct: " + correct + " | Incorrect: " + incorrect);
        }

        System.out.println();

        if (correct == 3) {
            System.out.println("You got 3 words correct!");
        } else {
            System.out.println("You got 3 words incorrect!");
        }

        scanner.close();
    }
}