// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(elizabethyen25)(clara21)
package project5;

import student.TestCase;

/**
 * @author eliza
 * @version 2022.04.22
 *
 */
public class StateTest extends TestCase {

    // fields
    private State dc;

    SinglyLinkedList<Race> races;

    /**
     * Set up the data for the test class
     */
    public void setUp() {

        Race white = new Race("White", 100, 50);
        Race black = new Race("Black", 100, 40);
        Race latino = new Race("Latino", 100, 30);
        Race asian = new Race("Asian", 100, 20);
        Race other = new Race("Other", 100, 10);

        races = new SinglyLinkedList<Race>();

        races.add(white);
        races.add(black);
        races.add(latino);
        races.add(asian);
        races.add(other);

        dc = new State("DC", races);
    }


    /**
     * test the getName function
     */
    public void testGetName() {
        assertEquals("DC", dc.getName());
    }


    /**
     * test the get race function
     */
    public void testGetRaces() {
        assertEquals(races, dc.getRaces());
    }

}