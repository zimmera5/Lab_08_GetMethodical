import java.util.Scanner;
public class SafeInput {

public static String getNonZeroLenString(Scanner pipe, String prompt)
{
    String retString = "";  // Set this to zero length. Loop runs until it isn’t
    do
    {
        System.out.print("\n" +prompt + ": "); // show prompt add space
        retString = pipe.nextLine();
    }while(retString.length() == 0);

    return retString;
}
public static int getInt(Scanner pipe, String prompt){ //this is setting the int steps for any main that uses getInt

    int retVal = 0;
    String trash = ""; //trash incorrect variables
    boolean done = false;

    do{
        System.out.println(prompt);
        if(pipe.hasNextInt()){
            retVal = pipe.nextInt();
            pipe.nextLine();
            done = true;
        }
        else{
            trash = pipe.nextLine();
            System.out.println("Not correct type: "+ trash); //when varible is incorrect like "acvef" instead of 1,2,3
        }
    }while(!done); //not done it will loop back

    return retVal;
}
    public static double getDouble(Scanner pipe, String prompt){ //this is setting the double variable

        double retVal = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.println(prompt);
            if(pipe.hasNextInt()){
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.println("Not correct type: "+ trash);
            }
        }while(!done);

        return retVal;
    }

}
