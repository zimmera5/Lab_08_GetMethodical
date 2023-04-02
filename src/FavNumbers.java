import java.util.Scanner;
public class FavNumbers {

    public static void main(String[] args) {

        int favNumber = 0;
        double favDouble = 0d;
        Scanner in = new Scanner(System.in);

        favNumber = SafeInput.getInt(in, "Favorite number: ");
        favDouble = SafeInput.getDouble(in, "Favorite double: ");


        System.out.println("Favorite number is "+ favNumber);
        System.out.println("Favortie Double is "+ favDouble );


    }




}
