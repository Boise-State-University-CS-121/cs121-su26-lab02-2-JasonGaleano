import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //retrieving number of seconds from user
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();
        System.out.println();

        //math to convert seconds into hours/minutes/seconds

        int hourstoSeconds = totalSeconds / 3600;
        int leftoverHours = totalSeconds % 3600;
        int minutestoSeconds = leftoverHours / 60;
        int leftoverMins = leftoverHours % 60;
        
        //Output after double checking math
        System.out.println("Hours: " + hourstoSeconds);
        System.out.println("Minutes: " + minutestoSeconds);
        System.out.println("Seconds: " + leftoverMins);


    }
}