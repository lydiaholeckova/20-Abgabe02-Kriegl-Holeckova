package at.fhj.iit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This Class tests GenericQueue for Datatype String
 */
@DisplayName("Testing GenericQueue Class")
public class GenericQueueStringTest {

    private GenericQueue<String> genQ;
    /**
     * This is the setup, where the GenericQueue genQ is initialised
     */
    @BeforeEach
    void setup(){
        genQ = new GenericQueue<>(2);
        genQ.offer("Element1");
        genQ.offer("Element2");
    }

    /**
     * Here the first method is tested. It is tested by adding a element to the GenericQueue and then
     * checking if the method returns true.
     * At the end it is tested, if the method returns false if the added amount of elements is bigger than the maxsize
     */
    @Test
    @DisplayName("Testing the method offer")
    public void testOffer() {
        assertFalse(genQ.offer("Element1"));
        assertFalse(genQ.offer("Element2"));
    }
    /**
     * In this test method the method poll() is tested by deleting the added element and then
     * checking if the element is still there (again with peek()).
     */
    @Test
    @DisplayName("Testing the method poll")
    public void testPoll() {
        genQ.poll();
        genQ.poll();
        assertEquals(null, genQ.poll());
    }
    /**
     * This method tests the remove() method by checking if the NoSuchElementException is thrown
     * if there is no element in the queue anymore.
     */
    @Test
    @DisplayName("Testing the method remove")
    public void testRemove() {
        genQ.remove();
        genQ.remove();
        assertThrows(NoSuchElementException.class, () -> {
            genQ.remove();
        });
    }

    /**
     * Here the peek() method is tested by checking the first element more than once
     * to be sure, it didn't delete the element and to be sure that it returns null,
     * when the queue is empty.
     */
    @Test
    @DisplayName("Testing the method peek")
    public void testPeek() {
        assertEquals("Element1", genQ.peek());

        genQ.poll();
        genQ.poll();
        assertEquals(null, genQ.peek());
    }

    /**
     * Here the element() method is tested, first by checking more than once to be sure,
     * it didn't delete the element and second to check if the NoSuchElementException is thrown
     * if there is no element in the queue anymore.
     */
    @Test
    @DisplayName("Testing the method element")
    public void testElement() {
        assertEquals("Element1", genQ.element());
        genQ.poll();
        assertEquals("Element2", genQ.element());
        genQ.poll();
        assertThrows(NoSuchElementException.class, () -> {
            genQ.element();
        });
    }
}


