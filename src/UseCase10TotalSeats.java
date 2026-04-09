import java.util.*;

/**
 * UC10 – Count Total Seats using Stream reduce()
 */

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}

public class UseCase10TotalSeats {

    public static void main(String[] args) {

        System.out.println("=== UC10: Total Seating Capacity ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 80));

        // Step 2: Stream + map + reduce
        int totalSeats = bogies.stream()
                .map(b -> b.capacity)      // extract capacity
                .reduce(0, Integer::sum); // sum

        // Step 3: Display result
        System.out.println("Total Seating Capacity: " + totalSeats);
    }
}