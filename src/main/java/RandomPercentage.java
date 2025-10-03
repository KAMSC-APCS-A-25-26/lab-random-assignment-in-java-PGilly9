import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random rand = new Random();
        Random seed = new Random(100);
        
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        double x = rand.nextDouble();
        double y = seed.nextDouble();

        x *= 100;
        y *= 100;
        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        System.out.printf("%.2f%%\n", x);
        System.out.printf("%.2f%%\n", y);



        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}