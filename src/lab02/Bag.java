package lab02;
/**
 *
 * @author jaden.young
 */
public interface Bag {
    
    public int getCurrentSize();
    public boolean isEmpty();
    public void add(int num);
    public void remove(int n);
    public void remove();
    public void clear();
    public int getFrequencyOf(int num);
    public boolean contains(int num);
}
