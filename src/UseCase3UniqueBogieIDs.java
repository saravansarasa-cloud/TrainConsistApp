import java.util.HashSet;

/**
 * Train Consist Management App
 * Use Case 3 – Track Unique Bogie IDs (HashSet)
 */

public class UseCase3UniqueBogieIDs {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App =====");

        // Create HashSet
        HashSet<String> bogieIds = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        System.out.println("\nTotal unique bogies: " + bogieIds.size());
    }
}