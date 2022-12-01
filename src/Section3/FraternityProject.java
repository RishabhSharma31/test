/*
Prompt the user for their age and gender, use selection control statements
to tell the user if they are eligible to join the fraternity or not.
Eligibility: Male(Character value M or F)
             Age must 19 or greater.
 */

package Section3;

import java.util.Scanner;

public class FraternityProject {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;
        char gender;

        System.out.println("Enter your age:");
        age = keyboard.nextInt();

        System.out.println("Enter your gender:");
        gender = keyboard.next().charAt(0);

        if(age >= 19 && gender == 'M') {
            System.out.println("Welcome to the Fraternity!");
        }
        else {
            System.out.println("Sorry, You cannot join the Fraternity");
        }
    }
}
