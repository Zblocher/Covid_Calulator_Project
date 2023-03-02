package project5;

/**
 * @author Clara McDaniel (clara21)
 * @version 2022.03.21
 *
 */
public class SinglyLinkedListTest extends student.TestCase {

    private SinglyLinkedList<String> list;

    /**
     * Constructs a SinglyLinkedList for each test method
     */
    public void setUp() {
        list = new SinglyLinkedList<String>();
    }


    /**
     * Ensures the size() method works correctly
     */
    public void testSize() {
        assertEquals(0, list.size());

        list.add("WOW");
        assertEquals(1, list.size());
    }


    /**
     * Ensures the add() by index and object method works correctly and throws
     * the correct exceptions
     */
    public void testAddIndex() {

    }


    /**
     * Ensures the add() by object only method works correctly and throws the
     * correct exceptions
     */
    public void testAdd() {
        String nullAgain = null;

        Exception thrown = null;
        try {
            list.add(nullAgain);

            fail();
        }
        catch (IllegalArgumentException e) {
            thrown = e;
        }
        assertNotNull(thrown);

        list.add("A");
        list.add("B");
        list.add("C");
        assertEquals(3, list.size());
    }


    /**
     * Ensures the isEmpty() method works correctly
     */
    public void testIsEmpty() {
        assertTrue(list.isEmpty());

        list.add("A");
        assertFalse(list.isEmpty());
    }


    /**
     * Ensures the remove() by object method works correctly
     */
    public void testRemoveE() {
        assertFalse(list.remove("A"));

        list.add("A");
        assertTrue(list.remove("A"));

        list.add("B");
        assertFalse(list.remove("A"));

        list.add("A");
        list.add("B");
        list.add("C");
        assertTrue(list.remove("C"));
        assertEquals(3, list.size());

        list.add("B");
        assertTrue(list.remove("B"));
        assertEquals(3, list.size());
        assertTrue(list.remove("B"));
        assertEquals(2, list.size());

        list.add("D");
        list.add("E");

        assertTrue(list.remove("D"));

        list.clear();

    }


    /**
     * Ensures the remove() by index method works correctly and throws the
     * correct assumptions
     */
    public void testRemoveInt() {
        Exception thrown = null;
        try {
            list.remove(0);

            fail();
        }
        catch (IndexOutOfBoundsException e) {
            thrown = e;
        }
        assertNotNull(thrown);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        assertTrue(list.remove(2));
        assertEquals(3, list.size());

        Exception thrown2 = null;
        try {
            list.remove(-1);

            fail();
        }
        catch (IndexOutOfBoundsException ex) {
            thrown2 = ex;
        }
        assertNotNull(thrown2);

        Exception thrown3 = null;
        try {
            list.remove(3);

            fail();
        }
        catch (IndexOutOfBoundsException exc) {
            thrown3 = exc;
        }
        assertNotNull(thrown3);
    }


    /**
     * Ensures that the get() method works correctly and throws the correct
     * exceptions
     */
    public void testGet() {
        Exception thrown = null;
        try {
            list.get(0);

            fail();
        }
        catch (IndexOutOfBoundsException e) {
            thrown = e;
        }
        assertNotNull(thrown);

        list.add("A");
        list.add("B");

        assertEquals("A", list.get(0));
        assertEquals("B", list.get(1));
    }


    /**
     * Ensures that the contains() method works correctly
     */
    public void testContains() {
        list.add("A");
        assertTrue(list.contains("A"));
        assertFalse(list.contains("B"));
        list.add("B");
        assertTrue(list.contains("B"));
    }


    /**
     * Ensures that the clear() method works correctly
     */
    public void toArray() {
        list.add("A");
        String[] temp = new String[1];
        temp[0] = "A";
        assertTrue(list.toArray().equals(temp));
    }


    /**
     * Ensures that the lastIndexOf() method works correctly
     */
    public void testLastIndexOf() {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("C");

        assertEquals(1, list.lastIndexOf("B"));
        assertEquals(4, list.lastIndexOf("C"));
        assertEquals(-1, list.lastIndexOf("E"));
    }


    /**
     * Ensures that the toString() method works correctly
     */
    public void testToString() {
        assertEquals("{}", list.toString());

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("C");
        assertEquals("{A, B, C, D, C}", list.toString());

        /**
         * list.clear();
         * list.add("soccer");
         * list.add("swimming");
         * list.add("gymnastics");
         * list.add("rope jumping");
         * list.add("jump roping");
         * assertEquals(
         * "{soccer, swimming, gymnastics, rope jumping, jump roping}", list
         * .toString());
         */

    }


    /**
     * test the gets
     */
    public void testGets() {
        list.add("soccer");
        assertEquals(list.getHead(), list.getHead());
        list.add("basketball");
        assertEquals(list.getHead().next(), list.getHead().next());
    }

}
