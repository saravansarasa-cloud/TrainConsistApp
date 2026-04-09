import java.util.LinkedHashSet;

/**
 * Train Consist Management App
 * Use Case 5 – Preserve Insertion Order using LinkedHashSet
 */

public class UseCase5LinkedHashSetTrain {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App =====");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt duplicate
        train.add("Sleeper"); // duplicate (ignored)

        // Display formation
        System.out.println("\nTrain Formation (Ordered & Unique):");
        System.out.println(train);

        System.out.println("\nTotal Bogies: " + train.size());
    }
}