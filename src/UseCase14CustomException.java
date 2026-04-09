/**
 * UC14 – Custom Exception for Invalid Bogie Capacity
 */

// Step 1: Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Step 2: Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {

        // Step 3: Validation (Fail-Fast)
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println(type + " → Capacity: " + capacity);
    }
}

// Step 3: Main Class
public class UseCase14CustomException {

    public static void main(String[] args) {

        System.out.println("=== UC14: Custom Exception Handling ===");

        try {
            // ✅ Valid Bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            b1.display();

            // ❌ Invalid Bogie (test)
            PassengerBogie b2 = new PassengerBogie("AC Chair", -10);
            b2.display();

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}