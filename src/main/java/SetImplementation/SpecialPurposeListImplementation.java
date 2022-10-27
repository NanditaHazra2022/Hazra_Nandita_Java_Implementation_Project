/* Java program to demonstrate
 * special purpose List implementation
 * using CopyOnWriteList class. */

package SetImplementation;

// Importing required classes.
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import java.util.Iterator;

// Main class.
public class SpecialPurposeListImplementation
extends Thread
{   //Start of main class.

    /* CopyOnWriteArrayList is
     * a List implementation,
     * where the add operation
     * is implemented by making
     * a new copy of the array;
     * no locking is ever required.
     * This implementation
     * is only appropriate for Lists
     * that are rarely modified,
     * but frequently iterated. */

    // Creating object of CopyOnWriteArrayList class.
    static CopyOnWriteArrayList arrayList
            = new CopyOnWriteArrayList();


    // Thread to add element in List.
    public void run()
    {   // Start of the thread to add element in List.

        arrayList.add(4);

    }   // End of the thread to add element in List.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        // Bulk addition of elements in List.
        Collections.addAll(arrayList, 1, 2, 3);

        // Creating object of main class.
        SpecialPurposeListImplementation addThread
                = new SpecialPurposeListImplementation();

        // Initiating the thread to add element in List.
        addThread.start();

        /* Exception handling block
         * for execution of the thread
         * to add element in List. */
        try
        {   // Start of try block.

            Thread.sleep(2000); // Thread is paused for 2 seconds.

        }   // End of try block.
        catch (InterruptedException e)
        {   // Start of catch block.

            // Printing exception on console.
            System.out.println(
                    "Exception for adding element to the List: "
                    + e
            );

        }   // End of catch block.

        // Printing List on console.
        System.out.println(
                "List: "
                + arrayList
        );

        // Creating iterator reference variable.
        Iterator itr
                = arrayList.listIterator();

        System.out.println("Iterating the List-> ");
        while (itr.hasNext())
        {   // Start of iteration block.

            int element = (int) itr.next();

            // Printing iterated element of the List.
            System.out.println(element);

        }   // End of iteration block.

    }   // End of execution thread.

}   // End of main class.
