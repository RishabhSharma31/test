package Section5;

public class StringMethods {
    public static void main(String[] args) {
        String name1 = "Rishabh Sharma";
        String name2 = "Rishabh Sharma";
        String name3 = "Bill Gates";

        for(int i=0; i<name1.length(); i++){
            System.out.print(name1.charAt(i) + " ");
        }
        System.out.println();

        if(name1.equals(name3)){
            System.out.println("Name1 and Name3 are equal");
        }else {
            System.out.println("Not matching");
        }

        if(name1.compareTo(name3) > 0){
            System.out.println("Name1 > Name2");
        }else {
            System.out.println("Name1 < Name3");
        }

    }
}
