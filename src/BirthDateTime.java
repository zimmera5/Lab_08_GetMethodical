import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] arg) {

        int yearBirth = 0;
        int monthBirth = 0;
        int dayOfBirth = 0;
        int hour = 0;
        int minutes = 0;
        Scanner in = new Scanner(System.in);

        yearBirth = SafeInput.getRangedInt(in, "Please enter birth year using 4 digit: ");
        monthBirth = SafeInput.getRangedInt(in, "Enter your birth month using 1-12: ");
        dayOfBirth = SafeInput.getRangedInt(in, "Enter the date of your birth using 1-30: ");
        hour = SafeInput.getRangedInt(in, "What is the hour: ");
        minutes = SafeInput.getRangedInt(in, "What is the minute now: ");

        System.out.print("Your birthday is " + yearBirth + monthBirth + dayOfBirth);
        System.out.print("The time is " + hour + minutes);
    }
}
