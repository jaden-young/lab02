package lab02;
import java.util.Random;

/**
 * Demonstrates the Scores class.
 * @author Jaden Young
 */
public class TestScores {
    public static void main(String[] args) {
        //instance variables
        Random rand = new Random();
        Scores score = new Scores(100);
        final int INITIAL_LENGTH = 100;
        
        //magic numbers are icky
        for(int i = 0; i < INITIAL_LENGTH; i++) {
            score.add(rand.nextInt(1000));
        }
        //print all entries
        for(int i = 0; i < INITIAL_LENGTH; i++) {
            //just in case
            try {
                System.out.println(i + ": " + score.get(i));
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("ERROR: Invalid index.");
            }
        }
        score.add(606);
        System.out.println("Current number of entries after adding 606: " + 
                score.getCurrentSize());
        score.remove(); //removes random entry
        try {
            score.remove(score.get(75));
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("ERROR: Invalid index.");
        }
        //print again
        for(int i = 0; i < score.getCurrentSize(); i++) {
            try {
                System.out.println(i + ": " + score.get(i));
            } catch (ArrayIndexOutOfBoundsException aiobe) {
                System.out.println("ERROR: Invalid index.");
            }
        }
        System.out.println("Number of times that 100 appears in the list: " + 
                score.getFrequencyOf(100));
        System.out.println("Does the list contain the number 606: " + 
                score.contains(606));
    }
}
