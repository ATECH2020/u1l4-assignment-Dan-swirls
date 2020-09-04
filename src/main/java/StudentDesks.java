import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int sGroupA = scanner.nextInt();
        int sGroupB = scanner.nextInt();
        int sGroupC = scanner.nextInt();
        /*
         *  your code goes here
         */
        System.out.print((sGroupA%2 + sGroupA/2) + (sGroupB%2 + sGroupB/2) + (sGroupC%2 + sGroupC/2));

        // closing the scanner object
        scanner.close();
    }
}