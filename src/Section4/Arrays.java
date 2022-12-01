package Section4;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Below is the enhanced version of for-loop");
        //enhanced for-loop
        for(int num: numbers){
            System.out.print(num + " ");
        }
    }
}
