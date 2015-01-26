package lab02;
/**
 *
 * @author jaden.young
 */
public interface Bag {
    
    /**
     * Accessor method:<BR>
     * Returns the number of values that have been assigned to the array
     * @return Number of entries in the array not counting empty indexes
     */
    public int getCurrentSize();
   
    /**
     * Accessor method:<BR>
     * Returns true if there are no entries in the array, false if there are
     * entries
     * @return True if array is empty, false if not
     */
    public boolean isEmpty();
    
    /**
     * Mutator method:<BR>
     * Adds a number to the end of the list.<BR>
     * If the list is full, the size of the list is doubled and the number is 
     * then assigned to the end of the list.
     * @param num Number to be added to the list
     */
    public void add(int num);
    
    /**
     * Mutator method:<BR>
     * Removes a random number from the list and shifts all other 
     * elements over to fill the hole.
     */
    public void remove();
    
    /**
     * Mutator method:<BR>
     * Removes the first occurrence a specified number from the list. <p>
     * If the number does not exist, then the list is not changed.<BR>
     * If the number removed is not at the end of the list, then the following 
     * elements are shifted over 1 to the left to fill the hole.
     * @param num Number to be removed
     */
    public void remove(int num);
    
    /**
     * Mutator method:<BR>
     * Sets all entries to 0
     */
    public void clear();
    
    /**
     * Accessor method:<BR>
     * Returns the number of times a given number is present in the list
     * @param num Number to be searched for
     * @return Number of entries of the number
     */
    public int getFrequencyOf(int num);
    
    /**
     * Accessor method:<BR>
     * Tells whether or not a given number is present in the array
     * @param num Number to be searched for
     * @return True if the number is in the array, false if not
     */
    public boolean contains(int num);
}
