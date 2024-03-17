import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperations {
    public static void main(String[] args) {
        // Create a HashSet of type String
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Pineapple");
        hashSet.add("Kiwi");
        hashSet.add("Strawberry");
        hashSet.add("Peach");
        hashSet.add("Watermelon");

        // Display elements of the HashSet
        System.out.println("HashSet elements: " + hashSet);

        // Check if an element is present in the HashSet
        String elementToCheck = "Apple";
        if (hashSet.contains(elementToCheck)) {
            System.out.println("Element '" + elementToCheck + "' is present in the HashSet.");
        } else {
            System.out.println("Element '" + elementToCheck + "' is not present in the HashSet.");
        }

        // Remove an element from the HashSet
        String elementToRemove = "Kiwi";
        boolean removed = hashSet.remove(elementToRemove);
        if (removed) {
            System.out.println("Element '" + elementToRemove + "' removed successfully.");
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the HashSet.");
        }

        // Display elements of the HashSet after removal
        System.out.println("HashSet elements after removal: " + hashSet);

        // Iterate through the HashSet using an Iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.println("Iterating through the HashSet:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of the HashSet: " + size);

        // Clear all elements from the HashSet
        hashSet.clear();
        System.out.println("HashSet after clearing all elements: " + hashSet);
    }
}
