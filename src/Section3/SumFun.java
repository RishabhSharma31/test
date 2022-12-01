/*
Create a SumFun file,
Maintain a sum of integers that the user will enter
Exit the loop if negative integer is entered
Once loop is exited, print the sum of all entered numbers.
 */

package Section3;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int input;

        System.out.println("Enter a non-negative integer to add to sum,");
        System.out.println("Otherwise enter a negative integer to exit.");
        input = keyboard.nextInt();

        while (input >= 0) {
            sum += input; //sum = sum + input.

            System.out.println("Enter a non-negative integer:");
            System.out.println("Otherwise a negative integer to exit.");
            input = keyboard.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
