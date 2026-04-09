import java.util.ArrayList;

/**
 * Train Consist Management App
 * Use Case 2 – Add Passenger Bogies (ArrayList Operations)
 */

public class UseCase2AddPassengerBogies {

    public static void main(String[] args) {

        System.out.println("===== Train Consist Management App =====");

        // Create ArrayList
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display list
        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Final state
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}