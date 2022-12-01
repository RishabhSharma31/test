package Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the elements in the array....");
        System.out.println("Enter a negative number to exit");

        System.out.print("Enter the number:");
        int number = input.nextInt();

        while(number > 0){
            numbers.add(number);
            System.out.print("Enter another number:");
            number = input.nextInt();
        }

        System.out.println();

        System.out.println("Printing the array elements in reverse order");
        for(int i = numbers.size() - 1; i >= 0; i--){
            System.out.print(numbers.get(i) + " ");
        }

    }
}
