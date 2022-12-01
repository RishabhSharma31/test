package Section3;

public class SampleExercise {
    public static void main(String[] args) {
//        System.out.println("Divisible by 3: ");
        for(int i=1; i<=100; i++) {
            if(i%3==0 && i%5==0) //semicolon ends the condition
            System.out.println("fizzbuzz");
        else if(i%5==0)
            System.out.println("buzz");
        else if(i%3==0)
            System.out.println("fizz");
        else
            System.out.println(i);
        }

    }
}

/*
1
2
fizz
4
buzz
fizz
7
8
fizz


 */