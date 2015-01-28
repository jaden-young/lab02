package lab02;
/**
 * Client classes must contain an array of int type. All methods are designed to
 * work with an integer array.  
 * @author Jaden Young
 */
public interface Bag {
    
    /** 
     * Returns the current number of items in the bag. Should be the number of 
     * filled entries, not total size of the array.
     */
    public int getCurrentSize();
   
    /** 
     * Tells whether or not the bag is empty. Empty meaning that no values have
     * been assigned other than default zero values.
     */
    public boolean isEmpty();
    
    /** Adds a number to the end of the bag */
    public void add(int num);
    
    /** Removes a number from the bag. Should be random */
    public void remove();
    
    /**
     * Removes a specified number from the bag
     */
    public void remove(int num);
    
    /**
     * Sets all entries to 0
     */
    public void clear();
    
    /**
     * Returns the number of times a specified number appears in the bag
     */
    public int getFrequencyOf(int num);
    
    /**
     * Tells whether or not a specified number is present in the bag
     */
    public boolean contains(int num);
}
