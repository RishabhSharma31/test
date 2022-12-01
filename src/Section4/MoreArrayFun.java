package Section4;

public class MoreArrayFun {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        //enhanced for-loop
        for(int num: numbers){
            System.out.print(num + " ");
        }
    }
}
