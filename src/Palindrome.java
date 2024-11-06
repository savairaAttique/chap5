/** allows user to enter a string, and if it is a Palindrome
 *  it will pass, false if not
 */
import java.util.Scanner;

public class Palindrome {

    public static String isPalindrome(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        String reversed = isPalindrome(input);
        if (reversed.equalsIgnoreCase(input)) {
            System.out.println("Pass. String is a palindrome.");

        }
        else {
            System.out.println("Fail. String is not a palindrome.");
        }
    }

}
