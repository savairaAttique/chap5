/** allows user to enter height and width for rectangle and calculate area
 *
 */

import java.util.Scanner;
public class Rectangle {

    private int height;
    private int width;

    public void measurements() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter height of rectangle: ");
        this.height = scan.nextInt();
        System.out.println("Enter width of rectangle: ");
        this.width = scan.nextInt();

    }

    public int calculateArea() {
        return height * width;
    }

    public boolean isLarge(int area) {
        return area > 300;
    }

    public void printSize(boolean isLarge) {
        if (isLarge) {
            System.out.println("This is a large rectangle.");
        }
        else {
            System.out.println("This is a small rectangle.");
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.measurements();

        int area = rectangle.calculateArea();
        boolean large = rectangle.isLarge(area);

        rectangle.printSize(large);
    }
}
