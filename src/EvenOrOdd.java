/** this program will make user input a number
 * then it will say if number is odd or even
 */



import java.util.Scanner;

public class EvenOrOdd {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public void printEven(boolean isEven) {
        if(isEven) {
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        EvenOrOdd check = new EvenOrOdd();
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        boolean result = check.isEven(number);
        check.printEven(result);
    }
}

