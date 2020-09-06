import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourInp;
        int converter;
        int minOut;
        /*
         *  your code goes here
         */
         hourInp = scanner.nextInt();
         converter = hourInp * 2;
         minOut =(converter % 60);
        System.out.print(minOut * 6);
        // closing the scanner object
        scanner.close();
    }
}