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
public class RaceTest extends TestCase {

    // fields

    private Race white;

    private Race black;

    private Race asian;

    /**
     * set up the data for the test class
     */
    public void setUp() {

        white = new Race("White", 100, 50);
        black = new Race("Black", 100, 40);
        Race lanino = new Race("Latino", 100, 30);
        asian = new Race("Asian", 100, 20);
        Race other = new Race("Other", 100, 10);
    }


    /**
     * test the getRace method
     */
    public void testGetRace() {
        assertEquals("White", white.getRace());
    }


    /**
     * test the getInfected method
     */
    public void testGetInfected() {
        assertEquals(100, white.getInfected());
    }


    /**
     * test the getDead method
     */
    public void testGetDead() {
        assertEquals(50, white.getDead());
    }


    /**
     * test the calculateCFR method
     */
    public void testCalculateCFR() {

        assertEquals(50.0, white.calculateCFR(), .00001);

        Race zero = new Race("zero", 0, 0);

        assertEquals(-1, zero.calculateCFR(), .00001);

        Race noInfected = new Race("zero", 0, 100);

        assertEquals(-1, noInfected.calculateCFR(), .00001);

        Race noDead = new Race("zero", 100, 0);

        assertEquals(-1, noDead.calculateCFR(), .00001);
        
        
    }


    /**
     * test the compareTo method
     */
    public void testCompareTo() {
        assertEquals(-1, black.compareTo(white));

        assertEquals(1, black.compareTo(asian));

        assertEquals(0, black.compareTo(black));
    }


    /**
     * test the toString method
     */
    public void testToString() {
        assertEquals("White: 100 cases, 50.0% CFR", white.toString());
        
    }

}