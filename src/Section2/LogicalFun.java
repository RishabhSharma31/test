package Section2;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = false;  //change true and false to check different result outputs.
        boolean isSunny = false;  //change true and false to check different result outputs.

        boolean combined = isRaining && isSunny;
        System.out.println("Is it raining and sunny?: " + combined);

        combined = isRaining || isSunny;
        System.out.println("Is it raining or sunny?: " + combined);

        combined = !isRaining;
        System.out.println("Is it not raining?: " + combined);
    }
}
