package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

/**
 * This is the test class for the class StringQueue.
 * All methods of StringQueue will be tested, so that a test-coverage of 100% can be reached.
 */
@DisplayName("Testing StringQueue Class")
class StringQueueTest {
    private StringQueue sq;


    /**
     * This is the setup, where the StringQueue sq is initialised
     */
    @BeforeEach
   void setup(){
        sq = new StringQueue(2);
        sq.offer("Element1");

   }

    /**
     * Here the first method is tested. It is tested by adding a element to the StringQueue and then
     * checking if the method returns true.
     * At the end it is tested, if the method returns false if the added amount of elements is bigger than the maxsize
     */
    @Test
    @DisplayName("Testing the method offer")
    public void testOffer() {
        assertTrue(sq.offer("Element2"));
        assertFalse(sq.offer("Element3"));
    }

    /**
     * In this test method the method poll() is tested by deleting the added element and then
     * checking if the element is still there (again with peek()).
     */
    @Test
    @DisplayName("Testing the method poll")
    public void testPoll() {
        sq.poll();
        sq.poll();
        assertEquals(null, sq.poll());
    }

    /**
     * This method tests the remove() method by checking if the NoSuchElementException is thrown
     * if there is no element in the queue anymore.
     */
    @Test
    @DisplayName("Testing the method remove")
    public void testRemove() {
        sq.remove();
       assertThrows(NoSuchElementException.class, () -> {
            sq.remove();
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
        assertEquals("Element1", sq.peek());
        assertEquals("Element1", sq.peek());
        sq.poll();
        assertEquals(null, sq.peek());
    }

    /**
     * Here the element() method is tested, first by checking more than once to be sure,
     * it didn't delete the element and second to check if the NoSuchElementException is thrown
     * if there is no element in the queue anymore.
     */
    @Test
    @DisplayName("Testing the method element")
    public void testElement() {
        assertEquals("Element1", sq.element());
        assertEquals("Element1", sq.element());
        sq.poll();
        assertThrows(NoSuchElementException.class, () -> {
            sq.element();
        });
    }
}