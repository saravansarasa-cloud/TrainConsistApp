import java.util.HashMap;
import java.util.Map;

/**
 * Train Consist Management App
 * Use Case 6 – Map Bogie to Capacity (HashMap)
 */

public class UseCase6BogieCapacityMap {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App =====");

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mappings
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        // Display mapping
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }
    }
}