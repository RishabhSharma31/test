package Section3;
import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args){
        int age;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the club");

        System.out.println("Please enter your age");
        age= keyboard.nextInt();

        if(age>=21) {
            System.out.println("Here, grab a beer");
        }
        else if(age>=18) {
            System.out.println("Here, grab a coke");
            System.out.println("Well, you can drive now.");
        }
        else {
            System.out.println("Well, you can drive now.");
        }

        System.out.println("Thanks for coming, See you again");
    }
}
