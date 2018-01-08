/**
 * This program get birth day and find day of week of that date
 */
import java.util.Scanner;

public class DOW_Finder
{
    /**
     * This is the main method
     */
    public static void main(String[] args)
    {
        // Get input
        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birthdate (yyyy-mm-dd) : ");
        input = scanner.next();
        
        // Echo the input for testing purpose
        System.out.println();
        System.out.println("birthdate = " + input);        
    } // End main
} // End class
