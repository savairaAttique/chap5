/** program allows user to
 * enter a num, and use the amount
 *of numbers for a fibonacci sequence, then it will ask user
 * if it wants to print more numbers
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean keepPrint = true;
        while(keepPrint) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();
            printFib(num);
            System.out.println("Want to print another?");
            if (scan.next().equalsIgnoreCase("yes")) {
                keepPrint = true;
            } else{
                System.out.print("Goodbye!"); break;
            }
        }
    }


    public static void printFib(int num) {
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Sequence: ");
        for(int i = 1; i <= num; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
