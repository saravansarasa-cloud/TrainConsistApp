import java.util.*;

/**
 * UC12 – Safety Compliance Check for Goods Bogies
 */

class GoodsBogie {
    String type;   // Cylindrical / Open / Box
    String cargo;  // Petroleum / Coal / Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class UseCase12SafetyCheck {

    public static void main(String[] args) {

        System.out.println("=== UC12: Safety Compliance Check ===");

        // Step 1: Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));

        // ❌ Try changing this to test failure:
        // bogies.add(new GoodsBogie("Cylindrical", "Coal"));

        // Step 2: Stream + allMatch
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Step 3: Result
        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT ✅");
        } else {
            System.out.println("Train is UNSAFE ❌");
        }
    }
}