/** Allows user to enter their name and highscore for the game
 *
 */

import java.util.Scanner;
public class GameScore {

    private String name;
    private int highScore;

    public String enterName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name (leave blank to quit): ");
        return scan.nextLine();
    }

    public void enterScore(String name) {
        if (!name.isEmpty()) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your high score: ");
            this.highScore = scan.nextInt();
        }
    }
    public void printScore() {
        System.out.println("Name: " + name);
        System.out.println("High score: " + highScore);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GameScore game = new GameScore();
        while (true) {
            String name = game.enterName();
            if (name.isEmpty()) {
                System.out.println("No name entered. Quiting...");
                break;
            }
            game.name = name;
            game.enterScore(name);
            game.printScore();
        }
    }
}
