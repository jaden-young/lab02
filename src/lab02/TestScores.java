package lab02;
import java.util.Random;

/**
 *
 * @author jaden.young
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
        for(int i = 0; i < INITIAL_LENGTH; i++) {
            System.out.println(score.get(i));
        }
        score.add(606);
        System.out.println("Current size of the object: " + 
                score.getCurrentSize());
        score.remove();
        score.remove(score.get(75));
        for(int i = 0; i < score.getCurrentSize(); i++) {
            System.out.println(score.get(i));
        }
        System.out.println(score.getFrequencyOf(100));
        System.out.println(score.contains(606));
    }
}
