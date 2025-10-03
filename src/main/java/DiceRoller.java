import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        // TODO: Create Random objects for dice rolling
        // 1. Three Random objects without seeds (unseeded dice)
        Random rand = new Random();
        int die1= rand.nextInt(6)+1;
        System.out.println("Unseeded Die 1: " + die1);

        int die2= rand.nextInt(6)+1;
        System.out.println("Unseeded Die 2: " + die2);

        int die3= rand.nextInt(6)+1;
        System.out.println("Unseeded Die 3: " + die3);


        // 2. One Random object with any seed value (seeded die)
        Random seed = new Random(44);
        int seedDie = seed.nextInt(6)+1;
        System.out.println("Seeded Die: " + seedDie);

        // TODO: Generate random integers for dice rolls
        
        // TODO: Display the dice rolls - 1-6
        // Show all four dice rolls with clear labels
        
        // TODO: Demonstrate the difference between seeded and unseeded
        // Run the program multiple times to show seeded consistency
    }
}
