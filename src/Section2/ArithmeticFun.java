package Section2;

public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//binary operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("The result of addition of a and b is " + result);
        System.out.println("The result of subtraction of a and b is " + difference);
        System.out.println("The result of product of a and b is " + product);
        System.out.println("The result of quotient of a and b is " + quotient);
        System.out.println("The result of remainder of a and b is " + remainder);

//unary operators
        result += 20;  //result = result + 20
        System.out.println("The result is now " + result);

        result++;  //++result
        System.out.println("The result++ is now " + result);

        result--;  //--result
        System.out.println("The result-- is now " + result);

        product *= 2;  //product = product * 2
        System.out.println("The final product value is " + product);

    }
}
