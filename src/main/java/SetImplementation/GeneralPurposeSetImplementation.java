/* Java program to demonstrate
* general-purpose Set implementations.
* There are three general-purpose
* Set implementations: HashSet, TreeSet, and LinkedHashSet. */
package SetImplementation;

// Importing required classes.
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// Main class.
public class GeneralPurposeSetImplementation
{   // Start of main class.

    // Starting point of execution.
    public static void main(String[] args)
    {   // Start of execution thread.

        //----------------Set implementation using HashSet starts------------------------
        // Creating HashSet.
        Set<Integer> numbers = new HashSet<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in HashSet is random." + '\n');
        // Inserting elements in HashSet.
        numbers.add(100);
        numbers.add(15);
        numbers.add(350);
        numbers.add(45);
        numbers.add(5000);

        // Printing entries of HashSet.
        System.out.println("HashSet: "
                + numbers);

        //----------------Set implementation using HashSet ends------------------------

        //----------------Set implementation using LinkedHashSet starts------------------------
        // Creating LinkedHashSet.
        Set<Integer> numbers1 = new LinkedHashSet<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in LinkedHashSet is sequential." + '\n');
        // Inserting elements in LinkedHashSet.
        numbers1.add(100);
        numbers1.add(15);
        numbers1.add(350);
        numbers1.add(45);
        numbers1.add(5000);

        // Printing newly created LinkedHashMap.
        System.out.println("LinkedHashMap: "
                + numbers1);

        //----------------Set implementation using LinkedHashSet ends------------------------

        //----------------Set implementation using TreeSet starts------------------------
        // Creating TreeSet.
        Set<Integer> numbers2 = new TreeSet<>();

        System.out.println("------------------------------------------------");
        System.out.println("Insertion in TreeSet is sorted." + '\n');
        // Inserting elements in TreeSet.
        numbers2.add(100);
        numbers2.add(15);
        numbers2.add(350);
        numbers2.add(45);
        numbers2.add(5000);

        System.out.println("TreeSet: "
                + numbers2);

        //----------------Set implementation using TreeSet ends------------------------

        System.out.println("------------------------------------------------");

    }   // End of execution thread.

}   // End of main class.
