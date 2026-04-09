import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Train Consist Management App
 * Use Case 7 – Sort Bogies using Comparator
 */

// Bogie class (custom object)
class Bogie {

    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }
}

// Main class
public class UseCase7SortBogies {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App =====");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            b.display();
        }

        // Sort using Comparator (by capacity)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by capacity):");
        for (Bogie b : bogies) {
            b.display();
        }
    }
}