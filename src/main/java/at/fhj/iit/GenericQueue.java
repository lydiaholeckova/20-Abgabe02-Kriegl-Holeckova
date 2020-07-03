package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author lydia holeckova
 * This class adds any datatype element to Queue
 * @param <T> generic datatype - can be replaced by all datatypes
 */
public class GenericQueue<T> implements IQueue<T> {
    private List<T> elements = new ArrayList<T>();
    private int maxSize = 5;

    /**
     * Constructor class for the generic Queue
     * @param maxsize - gives a number of elements in the Queue
     */
    public GenericQueue(int maxsize) {
        this.maxSize = maxsize;
    }

    /**
     * If the max size of Queue is not reached new Elements will be added to Queue - return true /else false
     * @param obj - any datatype
     * @return true if Element was successfully added to the Queue, else return false
     */

    public boolean offer(T obj) {
        if (elements.size() != maxSize)
            elements.add(obj);
        else
            return false;

        return true;
    }

    /**
     * If the queue is empty, method returns null, otherwise the first element
     * @return generic datatype
     */
    public T poll() {
        T element = peek();

        if (elements.size() > 0) {
            elements.remove(0);
        }

        return element;
    }

    /**
     * This method throws Exception if the Queue is empty
     * @return element
     */
    public T remove() {
        T element = poll();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
    public T peek() {
        T element;
        if (elements.size() > 0)
            element = elements.get(0);
        else
            element = null;

        return element;
    }
    public T element() {
        T element = peek();
        if (element == null)
            throw new NoSuchElementException("there's no element any more");

        return element;
    }
}