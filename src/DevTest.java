import java.util.Scanner;
public class DevTest {
    public static void main(String[] args) {

    String myName = "";
    Scanner in = new Scanner(System.in);

    myName = SafeInput.getNonZeroLenString(in, "Give me a name");

    System.out.println("Your Name Is "+ myName);


    }
}