import java.util.Scanner;

public class HMSConverter {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //getting time values

        int hours;
        int minutes;
        int seconds;

        System.out.print("Enter the number of hours: ");
        hours = scanner.nextInt();
        System.out.print("Enter the number of minutes: ");
        minutes = scanner.nextInt();
        System.out.print("Enter the number of seconds: ");
        seconds = scanner.nextInt();

        //gives a space from user input to output
        System.out.println();


        //Math to convert everything to seconds
        int totalTime = (hours * 3600) + (minutes * 60) + seconds;
        System.out.print("Total seconds: " + totalTime);

    }
}
