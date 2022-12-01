package Section2;

public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 27;
        int yourAge = 20;
        int randomAge = 20;

        String myName = "Rishabh";
//        String yourName = "Rishabh";
        String yourName = "Rishab";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        //relational operators
        boolean ageCompare = myAge > yourAge;
        System.out.println("myAge > yourAge?: " + ageCompare);

        ageCompare = yourAge > randomAge;
        System.out.println("yourAge > randomAge?: " + ageCompare);

        ageCompare = yourAge == randomAge;
        System.out.println("yourAge == randomAge?: " + ageCompare);

        boolean nameCompare = myName.equals(yourName);
        System.out.println("Do the names match?: " + nameCompare);

        // currentAge test
        int currentAge = 27;
        boolean isGreater20 = currentAge >= 20;
        System.out.println("currentAge >= 20: " + isGreater20);

    }
}
