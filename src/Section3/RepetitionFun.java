// while, do-while, for loop

package Section3;

import java.util.Scanner;

public class RepetitionFun {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Enter a non-negative integer,");
        System.out.println("Otherwise a negative integer to exit.");
        input = keyboard.nextInt();

        while(input >= 0) {
            System.out.println(input);

            System.out.println("Enter a non-negative integer:");
            System.out.println("Otherwise a negative integer to exit.");
            input = keyboard.nextInt();
        }
        System.out.println("Done!");




//        int count = 0;
//
//        while(count < 10) {
//            System.out.println(count);
//            count++;
//        } //while loop

//        int count2 = 12;
//        do {
//            System.out.println(count2);
//            count2++;
//        }
//        while(count2 < 10);
        // do-while loop

//        for(int i = 0; i < 10; i++) {
//            System.out.println(i);
//        } //for loop
    }
}
