/** allows user to enter a num
 * and will tell if it is prime num or not
 */

import java.util.Scanner;

public class PrimeNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter a num to check if it is prime: ");
            int num = scan.nextInt();
            if(isPrime(num)){
                System.out.println(num + " is a prime num.");
            } else{
                System.out.println(num + " is not a prime num.");
            }

        }

    }





    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
