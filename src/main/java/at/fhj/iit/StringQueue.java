package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * This class implements the interface IQueue and represents a Queue for Strings.
 */
public class StringQueue implements IQueue<String> {

  private List<String> elements = new ArrayList<String>();
  private int maxSize;

    /**
     * This constructor initialises the variable maxSize (the maximal size the Queue can get)
     * @param maxsize
     */
  public StringQueue(int maxsize) {
    this.maxSize = maxsize;
  }

    /**
     * Checks if maxSize is already reached and if not, it
     * adds the String obj to the queue.
     *
     * @param obj
     * @return true if the addition is successful otherwise false
     */
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

    /**
     * Returns the head (first) element and also deletes it. That is, we cannot get it again.
     * If no element exists (when queue is empty), the method returns null.
     *
     * @return the first element in the queue (head)
     */
  public String poll() {
    String element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

    /**
     * It also returns and deletes the head element like poll(), but with a small difference.
     * This method throws NoSuchElementException if the queue is empty.
     *
     * @return the first element in the queue (head)
     */
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

    /**
     * Returns the head element but it does not delete it. That is, we can get it again.
     * Returns null when the queue is empty.
     *
     * @return the first element in the queue (head)
     */
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

    /**
     * It works similar to peek() but with a small difference (returns but does not delete the element).
     * It throws NoSuchElementException when the queue is empty.
     *
     * @return the first element in the queue (head)
     */
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}