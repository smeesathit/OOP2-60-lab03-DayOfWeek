/**
 * This program get birth day and find day of week of that date
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class DOW_Finder
{
    /**
     * This is the main method
     */
    public static void main(String[] args)
    {
        SimpleDateFormat sdf;
        // Get input via the standard input window
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birthdate (yyyy-mm-dd) : ");
        input = scanner.next();

        /*
        // Echo the input for testing purpose
        System.out.println();
        System.out.println("birthdate = " + input);        
         */

        // Find and show day of week
        // Convert String to java.util.Date 
        java.util.Date bDate = java.sql.Date.valueOf(input);
        // Show only day of week (full word)
        sdf = new SimpleDateFormat("EEEE");
        System.out.println("Your was born on a " + sdf.format(bDate) + ".");        
    } // End main
} // End class
