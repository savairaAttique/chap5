/** this program allows user to input a string value
 * and will then repeat it back
 */


import java.util.Scanner;


public class RepeatString {
    public static void main(String[] args) {

        RepeatString input = new RepeatString();
        String same = input.getInput();
        input.printString(same);


    }

    public String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        return userInput;

    }
    public void printString(String input) {
        System.out.println(input);

    }
}
