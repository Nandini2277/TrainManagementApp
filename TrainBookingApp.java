import java.util.*;
import java.util.stream.*;

public class UC8_FilterBogies {
    public static void main(String[] args) {

        // Step 1: Reuse bogie list (from UC7)
        List<Bogie> bogies = Arrays.asList(
                new Bogie(1, "Sleeper", 72),
                new Bogie(2, "AC", 50),
                new Bogie(3, "General", 90),
                new Bogie(4, "Chair Car", 60),
                new Bogie(5, "AC 3 Tier", 64)
        );

        // Step 2–4: Stream → Filter → Collect
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // condition
                .collect(Collectors.toList());

        // Step 5: Display result
        System.out.println("Filtered Bogies (capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Step 6: Program continues
        System.out.println("Program continues...");
    }
}