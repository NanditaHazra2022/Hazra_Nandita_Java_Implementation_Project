/* Java program to demonstrate
* general purpose List implementation
* using ArrayList and LinkedList.
* ArrayList offers constant-time
* positional access and therefore fast.
* For frequent iteration over the List
* to delete elements from its interior,
* LinkedList is used. */
package SetImplementation;

// Importing required classes.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

// Main class.
public class GeneralPurposeListImplementation
{   // Start of main thread.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        //----------------List implementation using ArrayList starts------------------------
        // Creating a string dynamic array.
        List<String> items = new ArrayList<>();

        /* Adding elements to
         * the string dynamic array in bulk. */
        Collections.addAll(items, "Storybooks",
                "Toys",
                "Puzzles",
                "Musical-instruments",
                "Artwork",
                "Craft-work",
                "Exercising-equipments",
                "Articles");

        /* Printing the newly created
         * string dynamic array. */
        System.out.println("------------------------------------------------");
        System.out.println("ArrayList-> ");
        for (Object o : items)
        {   // Start of for-each loop.
            System.out.print(o + " "); // Elements are printed space apart.
        }   // End of for-each loop.
        //----------------List implementation using ArrayList ends------------------------

        //----------------List implementation using LinkedList starts------------------------
        // Creating integer dynamic array using LinkedList.
        List<Integer> numberList = new LinkedList<>();

        // Adding numbers to the list.
        for (int i = 100;
             i <= 1000;
             i = i + 100)
        {   // Start of for loop.

            numberList.add(i);

        }   // End of for loop.

        // Printing elements of the list.
        System.out.println('\n' + "------------------------------------------------");
        System.out.println("LinkedList-> "
                + '\n'
                + numberList);

        // Removing even numbers from the list.
        for (int i = 1;
             i <= 6;    // As it's a dynamic array, as soon as one number is removed, its position will be filled by the number adjascent to it.
             i = i + 2)
        {   // Start of for loop.

            numberList.remove(i);

        }   // End of for loop.

        // Printing elements of the modified list.
        System.out.println('\n'
                + "Modified LinkedList after removing even numbers-> "
                + '\n'
                + numberList);
        //----------------List implementation using LinkedList ends------------------------

        System.out.println("------------------------------------------------");

    }

}
