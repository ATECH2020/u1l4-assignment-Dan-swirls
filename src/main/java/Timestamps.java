import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();
        //my variables
        int hoursPassed;
        int minPassed;
        int secPassed;
        int totalSec;
        /*
         *  your code goes here
         */

        hoursPassed = (hours2 - hours1);
        minPassed = (minutes2 - minutes1);
        secPassed = (seconds2 - seconds1);
        totalSec = ((hoursPassed * 3600) + (minPassed * 60) + secPassed);
        System.out.print(totalSec);

        // closing the scanner object
        scanner.close();
    }
}