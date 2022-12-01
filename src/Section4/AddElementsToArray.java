package Section4;

import java.util.Scanner;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numbers.length; i++){
            int number = input.nextInt();
            numbers[i] = number;
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] * 2 + " ");
        }
    }
}
