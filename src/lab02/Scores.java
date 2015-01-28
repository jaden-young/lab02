package lab02;
import java.util.Random;

/**
 * Defines a Scores object containing an integer array. The bag interface is 
 * implemented, along with one additional method that returns the value stored
 * at a specified index.
 * @author Jaden Young
 */
public class Scores implements Bag {
    private int[] list;
    private int count;
    
    /**
     * Default constructor:<BR>
     * initializes an integer array of length 50 and sets count to 0
     */
    public Scores() {
        list = new int[50];
        count = 0;
    }
    
    /**
     * Overloaded constructor:<BR> 
     * Initializes an int array with specified length
     * @param startLength Length of the array
     */
    public Scores(int startLength) {
        list = new int[startLength];
        count = 0;
    }
    
    /**
     * Accessor method:<BR>
     * Returns the number of values that have been assigned to the array
     * @return Number of entries in the array not counting empty indexes
     */
    @Override
    public int getCurrentSize() {
        return count;
    }
    
    /**
     * Accessor method:<BR>
     * Returns true if there are no entries in the array, false if there are
     * entries
     * @return True if array is empty, false if not
     */
    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * Mutator method:<BR>
     * Sets all entries to 0
     */
    @Override
    public void clear() {
        for (int i = 0; i < count; i++) {
            list[i] = 0;
        }
        count = 0;
    }
    
    /**
     * Mutator method:<BR>
     * Adds a number to the end of the list.<BR>
     * If the list is full, the size of the list is doubled and the number is 
     * then assigned to the end of the list.
     * @param num Number to be added to the list
     */
    @Override
    public void add(int num) {
        if(count == list.length) {
            int[] temp = new int[2 * list.length];
            for(int i = 0; i < count; i++) {
                temp[i] = list[i];
            }
            list = temp;
            temp = null;
        }
        list[count] = num;
        count++;
    }
    
    /**
     * Accessor method:<BR>
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
     * Accessor method:<BR>
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
     * Mutator method:<BR>
     * Removes the first occurrence a specified number from the list. <p>
     * If the number does not exist, then the list is not changed.<BR>
     * If the number removed is not at the end of the list, then the following 
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
     * Mutator method:<BR>
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
     * Accessor method:<BR>
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
