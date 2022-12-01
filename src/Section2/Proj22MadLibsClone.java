/*
We'll be writing a simple clone of a single Mad Libs game.
We will be prompting the user before they see the story for various words and parts
of speech. You can collect all this data as strings. Then, you place these words
throughout the story in the appropriate spots indicated.
 */

package Section2;

import java.util.Scanner;

public class Proj22MadLibsClone {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String adj1;
        String girlName;
        String adj2;
        String occupation1;
        String placeName;
        String clothing;
        String hobby;
        String adj3;
        String occupation2;
        String boyName;
        String manName;

        System.out.print("Enter an adjective:\t");
        adj1 = keyboard.nextLine();

        System.out.print("Enter a girl's name:\t");
        girlName = keyboard.nextLine();

        System.out.print("Enter another adjective:\t");
        adj2 = keyboard.nextLine();

        System.out.print("Enter an occupation:\t");
        occupation1 = keyboard.nextLine();

        System.out.print("Enter a name of a place:\t");
        placeName = keyboard.nextLine();

        System.out.print("Enter a piece of clothing:\t");
        clothing = keyboard.nextLine();

        System.out.print("Enter a hobby:\t");
        hobby = keyboard.nextLine();

        System.out.print("Enter another adjective:\t");
        adj3 = keyboard.nextLine();

        System.out.print("Enter another occupation:\t");
        occupation2 = keyboard.nextLine();

        System.out.print("Enter a boy's name:\t");
        boyName = keyboard.nextLine();

        System.out.print("Enter a man's name:\t");
        manName = keyboard.nextLine();

        System.out.println("There once was a " + adj1 + " girl named " + girlName +
                " who was a " + adj2 + " " + occupation1 + "in the land of " + placeName + ".");

        System.out.println("She liked wearing " + clothing + " and to " + hobby + ". She wanted to marry"
        + adj3 + " " + occupation2 + " named " + boyName + " Although her father, the King" + manName +
                " forbid her from doing so.");



    }
}
