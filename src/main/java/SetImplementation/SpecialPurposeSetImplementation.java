/* Java program to demonstrate
* special purpose set implementation.
* There are two special-purpose
* Set implementations — EnumSet
* and CopyOnWriteArraySet. */

package SetImplementation;

// Importing required class.
import java.util.EnumSet;

// Main class.
public class SpecialPurposeSetImplementation
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        /* EnumSet is a high-performance
        * Set implementation for enum types.
        * Enum sets support iteration
        * over ranges of enum types. */
        System.out.println("Working days:");
        for (Day d : EnumSet.range(Day.MONDAY, Day.FRIDAY))
        {
            System.out.println(d);
        }

        /* CopyOnWriteArraySet is a Set implementation
        * where all mutative operations,
        * such as add, set, and remove,
        * are implemented by making
        * a new copy of the array;
        * no locking is ever required.
        * Even iteration may safely proceed
        * concurrently with element
        * insertion and deletion.
        * This implementation
        * is only appropriate for sets
        * that are rarely modified,
        * but frequently iterated.
        * It is well suited for maintaining
        * event-handler lists
        * that must prevent duplicates. */

    }   // End of execution thread.

}   // End of main class.
