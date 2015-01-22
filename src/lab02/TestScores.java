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
        final int SCORE_LENGTH = 100;
        
        //populate the object with random values 1-1000
        for(int i = 0; i < SCORE_LENGTH; i++) {
            score.add(rand.nextInt(1000));
        }
        
        //print contents of object
        
    }
}
