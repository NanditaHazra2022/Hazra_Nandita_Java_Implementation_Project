/* Java program to demonstrate
* special purpose Set implementation
* using CopyOnWriteSet class. */

package SetImplementation;

// Importing required classes.
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Collections;
import java.util.Iterator;

// Main class.
public class SpecialPurposeSetImplementation2
            extends Thread
{   //Start of main class.

    /* CopyOnWriteArraySet is
    * a Set implementation
    * where the add operation,
    * is implemented by making
    * a new copy of the array;
    * no locking is ever required.
    * During iteration,
    * remove operation on Set elements
    * is not supported.
    * This implementation
    * is only appropriate for sets
    * that are rarely modified,
    * but frequently iterated. */

    // Creating object of CopyOnWriteArraySet class.
    static CopyOnWriteArraySet arraySet =
            new CopyOnWriteArraySet();

    // Thread to add element in Set.
    public void run()
    {   // Start of adding element in Set thread.

        arraySet.add("D");

    }   // End of adding element in Set thread.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Bulk addition of elements in Set.
        Collections.addAll(arraySet, "A", "B", "C");

        // Creating object of main class.
        SpecialPurposeSetImplementation2 addThread
                = new SpecialPurposeSetImplementation2();

        // Initiating add element to Set thread.
        addThread.start();

        /* Exception handling block
        * for execution of add element to Set thread. */
        try
        {   // Start of try block.

            Thread.sleep(2000); // Thread is paused for 2 seconds.

        }   // End of try block.
        catch (InterruptedException e)
        {   // Start of catch block.

            // Printing exception on console.
            System.out.println(
                    "Exception while adding element using Thread: "
                    + e
            );

        }

        // Printing Set on console.
        System.out.println(
                "Set: "
                + arraySet
        );

        // Creating iterator reference variable.
        Iterator itr
                = arraySet.iterator();

        System.out.println("Iterating the Set-> ");
        while (itr.hasNext())
        {   // Start of iteration block.

            String element = (String) itr.next();

            // Printing iterated element of the Set.
            System.out.println(element);

            /* Removing C element from the Set,
            * which is not permitted during iteration
            * for CopyOnWriteArraySet class. */
            if (element.equals("C"))
            {

                // Exception handling block
                try
                {   // Start of try block.

                    itr.remove();

                }   // End of try block.
                catch (UnsupportedOperationException e)
                {   // Start of catch block.

                    // Printing exception on the console.
                    System.out.println(
                            "Exception while removing element from Set during iteration: "
                            + e
                    );

                } // End of catch block.

            }   // End of if block.

        }   // End of iteration block.

    }   // End of execution thread.

}   // End of main class.
