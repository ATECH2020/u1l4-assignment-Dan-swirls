import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int sec = scanner.nextInt();
        int hour, min;
        //Your code goes here
        hour = sec / 3600;
        min = sec / 60; 
        System.out.print(hour + " " + min);
      
        // closing the scanner object
        scanner.close();
    }
}