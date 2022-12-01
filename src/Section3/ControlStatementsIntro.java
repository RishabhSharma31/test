/*
Control flow-order in which instructions are executed within a program
 */

package Section3;

public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age = 11;

        if(age >= 16) {
            System.out.println("You are legal to drive");
        }
        else {
            System.out.println("You cannot drive yet");
        } // if-else statements

        System.out.println(); //adds new line space

        for(int i = 1; i <= age; i++) {
            System.out.println("Happy Birthday " + i);
        } // for loop statements
    }
}
