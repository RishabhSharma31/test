package Section3;

import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade:");
        grade = keyboard.next().charAt(0);

        switch(grade) {
            case 'A' : //upper case
            case 'a' : //lower case
                System.out.println("Great job!");
                break;
            case 'B' :
            case 'b' :
                System.out.println("Good job!");
                break;
            case 'C' :
            case 'c' :
                System.out.println("Cmon, You can do better!");
                break;
            case 'D' :
            case 'd' :
                System.out.println("Buckle up or else ypu may fail the course!!");
                break;
            case 'F' :
            case 'f' :
                System.out.println("You are failing at the course!");
                break;
            default:
                System.out.println("Please enter a valid grade!");
        }
    }
}
