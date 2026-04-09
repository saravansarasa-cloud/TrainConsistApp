import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * UC11 – Validate Train ID & Cargo Code using Regex
 */

public class UseCase11RegexValidation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC11: Regex Validation ===");

        // Step 1: Input
        System.out.print("Enter Train ID: ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        // Step 4: Match input
        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        // Step 5: Validate
        if (m1.matches()) {
            System.out.println("Valid Train ID ✅");
        } else {
            System.out.println("Invalid Train ID ❌");
        }

        if (m2.matches()) {
            System.out.println("Valid Cargo Code ✅");
        } else {
            System.out.println("Invalid Cargo Code ❌");
        }

        sc.close();
    }
}