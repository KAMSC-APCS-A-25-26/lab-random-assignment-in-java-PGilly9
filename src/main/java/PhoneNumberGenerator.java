import java.util.Random;

public class PhoneNumberGenerator {
    public static void main(String[] args) {
        // TODO: Create Random object for phone number generation
        Random rand = new Random();

        // TODO: Generate first three digits (XXX)
        // Constraint: Cannot contain 8 or 9 (digits 0-7 only)
        int firstThree = 0;
        firstThree += rand.nextInt(8);
        firstThree += rand.nextInt(8)*10;
        firstThree += rand.nextInt(8)*100+100;

        // TODO: Generate second three digits (XXX) 
        // Constraint: Must be <= 742 (000-742)
        int numNext3= rand.nextInt(642)+100;
        
        // TODO: Generate third three digits (XXX)
        // No constraints (000-999)
        int numNextFew= rand.nextInt(899)+100;


        // TODO: Format and display phone number as XXX-XXX-XXX
        // Include the dashes in the output
       System.out.println(firstThree + "-" + numNext3 + "-" + numNextFew);

    }
}
