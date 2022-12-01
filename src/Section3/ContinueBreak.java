package Section3;

public class ContinueBreak {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            if(count == 5) {
                count++;
                continue; //this skips 5 and continues from 6
//                break; // this breaks loop at 4
            }

            System.out.print(count + "\t"); //prints in single line. Replace \t to print in new lines.
            count++;
        } //while loop
    }
}
