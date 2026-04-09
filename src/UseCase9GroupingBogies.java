import java.util.*;
import java.util.stream.Collectors;

/**
 * UC9 – Group Bogies by Type using Stream API
 */

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println(name + " → Capacity: " + capacity);
    }
}

public class UseCase9GroupingBogies {

    public static void main(String[] args) {

        System.out.println("=== UC9: Group Bogies by Type ===");

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 80));

        // Step 2: Group using Stream
        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getName));

        // Step 3: Display grouped result
        for (String key : grouped.keySet()) {
            System.out.println("\nType: " + key);
            for (Bogie b : grouped.get(key)) {
                b.display();
            }
        }
    }
}