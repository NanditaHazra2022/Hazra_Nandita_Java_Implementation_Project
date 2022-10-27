/* Java program to demonstrate
* special purpose Set implementation
* using EnumSet class. */

package SetImplementation;

// Importing required class.
import java.util.EnumSet;

// Main class.
public class SpecialPurposeSetImplementation1
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        /* EnumSet is a high-performance
        * Set implementation for enum types.
        * EnumSet support iteration
        * over ranges of enum types. */
        System.out.println("Iterating the Set-> ");
        for (Day d : EnumSet.range(Day.THURSDAY, Day.SUNDAY))
        {
            System.out.println(d);  // Printing elements of Enum Day.
        }

    }   // End of execution thread.

}   // End of main class.
