/** User will input name, address, city and state
 and instance variables will hold it, the main method
 will print the complete address
 */

import java.util.Scanner;
public class Address {

    private String name;
    private String street;
    private String city;
    private String state;

    public static void main(String[] args) {
        Address userAddress = new Address ();

        userAddress.nameAddress();
        userAddress.cityState();

        userAddress.printAddress();
    }

    public void nameAddress () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = scan.nextLine();
        System.out.println("Enter your street address: ");
        this.street = scan.nextLine();
    }

    public void cityState () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your city: ");
        this.city = scan.nextLine();
        System.out.println("Enter your state: ");
        this.state = scan.nextLine();

    }

    public void printAddress() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.street);
        System.out.println("City: " + this.city);
        System.out.println("State: " + this.state);
    }

}
