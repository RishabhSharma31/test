package Section2;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String city;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("What is your age?");
        age = keyboard.nextInt();
        keyboard.nextLine();  //added this so that console takes city input

        System.out.println("Which city do you belong to");
        city = keyboard.nextLine();

        System.out.println("Hello there, " + name);
        System.out.println("Your age is, " + age);
        System.out.println("Your city is, " + city);
    }
}
