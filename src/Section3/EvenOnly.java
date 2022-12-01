/*
Create an EvenOnly file,
loop through 0 to 10(exclusive), printing out only even integers.
Use continue and try to use operators
 */

package Section3;

public class EvenOnly {
    public static void main(String[] args) {
        int count = 0;

        while(count < 10) {
            if(count % 2 != 0) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }
    }
}
