/** program allows user to
 * input a string,
 * then will repeat it back to them but reversed
 */

import java.util.Scanner;
public class ReversedString {

    public static String reverseString(String input) {
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
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
