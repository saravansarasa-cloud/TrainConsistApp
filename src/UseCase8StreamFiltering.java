import java.util.*;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * UC8 – Filter Passenger Bogies Using Streams
 */

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class UseCase8StreamFiltering {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App UC8 ===");

        // Step 1: Create list (reuse UC7 idea)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 80));

        // Step 2: Apply Stream filter
        List<Bogie> filtered = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // Step 3: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");

        for (Bogie b : filtered) {
            b.display();
        }
    }
}