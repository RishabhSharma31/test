/*
Prompt the user for three different real numbers and
print out the average of these three numbers
 */

package Section2;

import java.util.Scanner;

public class Proj21AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double average;

        System.out.println("Please enter three numbers.");
        n1 = keyboard.nextDouble();
        n2 = keyboard.nextDouble();
        n3 = keyboard.nextDouble();
        keyboard.nextLine();

        average = (n1 + n2 + n3) / 3.0;

        System.out.println("The average of the given three numbers is " + average);
    }
}
