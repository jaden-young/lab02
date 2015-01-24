package lab02;
import java.util.Random;

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
    
    /**
     * Adds a number to the end of the list.
     * If the list is full, the size of the list is doubled and the number is 
     * then assigned to the end of the list.
     * @param num Number to be added to the list
     */
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
        count++;
    }
    
    /**
     * Returns the number of times a given number is present in the list
     * @param num Number to be searched for
     * @return Number of entries of the number
     */
    @Override
    public int getFrequencyOf(int num) {
        int frequency = 0;
        for(int i = 0; i < count; i++) {
            if(list[i] == num)
                frequency++;
        }
        return frequency;
    }
    
    /**
     * Tells whether or not a given number is present in the array
     * @param num Number to be searched for
     * @return True if the number is in the array, false if not
     */
    @Override
    public boolean contains(int num) {
        for(int i = 0; i < count; i++) {
            if(list[i] == num)
                return true;
        }
        return false;
    }
    
    /**
     * Removes the first occurrence a specified number from the list.
     * If the number does not exist, then the list is not changed.
     * If the number removed is not at the end of the list, then all other 
     * elements are shifted over 1 to the left to fill the hole.
     * @param num Number to be removed
     */
    @Override
    public void remove(int num) {
        int index = -1;
        int i = 0;
        while(i < count && index == -1) {
            if(list[i] == num)
                index = i;
            i++;
        }
        if(index != -1) {
            for(i = index; i < count; i++) {
                    list[i] = list[i + 1];
            }
            count--;
        }
    }
    
    /**
     * Removes a random number from the list and shifts all other 
     * elements over to fill the hole.
     */
    @Override
    public void remove() {
        Random rand = new Random();
        int index = rand.nextInt(count);
        for(int i = index; i < count; i++) {
            list[i] = list[i + 1];
        }
        count--;
    }
    
    /**
     * Returns the number at the specified index position
     * @param i Index to search
     * @return Number at specified index
     */
    public int get(int i) {
        if(i < 0 || i > list.length)
            throw new ArrayIndexOutOfBoundsException();
        return list[i];
    }
}
