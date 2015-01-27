package lab02;
/**
 * Classes must contain an array of int type. All methods are designed to work
 * 
 * @author Jaden Young
 */
public interface Bag {
    
    /** 
     * Returns the current number of items in the bag. Should be the number of 
     * filled entries, not total size of whatever structure is being used.
     */
    public int getCurrentSize();
   
    /** 
     * Tells whether or not the bag is empty. This meaning that at least 1 
     * nondefault value has been assigned to the data structure.
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
     * Clears the bag
     */
    public void clear();
    
    /**
     * Returns the number of times a specified number from the bag
     */
    public int getFrequencyOf(int num);
    
    /**
     * Tells whether or not a specified number is present in the bag
     */
    public boolean contains(int num);
}
