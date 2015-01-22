package lab02;

/**
 *
 * @author jaden.young
 */
public class Scores implements Bag {
    private int[] list;
    private int count;
    
    /**
     * Default constructor. Initializes an array of length 50
     */
    public Scores() {
        list = new int[50];
        count = 0;
    }
    
    /**
     * Overloaded constructor. Initializes an array with specified length
     * @param len Length of the array
     */
    public Scores(int len) {
        list = new int[len];
        count = 0;
    }
    
    /**
     * Returns the number of values that have been assigned to the array
     * @return Number of entries in the array not counting empty indexes
     */
    @Override
    public int getCurrentSize() {
        return count;
    }
    
    /**
     * Returns true if there are no entries in the array, false if there are
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Sets all entries to 0
     */
    @Override
    public void clear() {
        for (int i = 0; i < count; i++) {
            list[i] = 0;
        }
    }
    
    @Override
    public void add(int num) {
        if(count == list.length) {
            int[] temp = new int[2 * list.length];
            for(int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }
            list = temp;
            temp = null;
        }
        list[count] = num;
    }
    
}
