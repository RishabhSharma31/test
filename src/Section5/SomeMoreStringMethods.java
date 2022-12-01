package Section5;

public class SomeMoreStringMethods {
    public static void main(String[] args) {
        String name = "Rishabh Sharma";

        System.out.println("Name in uppercase " + name.toUpperCase());
        System.out.println("Name in lowercase " + name.toLowerCase());

        int whereIsR = name.indexOf("r");
        System.out.println("r is located at " + whereIsR + " index");

        String lastName = name.substring(11);
        System.out.println("Last name is " + lastName);

    }
}
