/**
 * // Virginia Tech Honor Code Pledge:
 * //
 * // As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * // I will not lie, cheat, or steal, nor will I accept
 * the actions of those who do.
 * // Elizabeth Yen (elizabethyen25)(zblocher)
 */

package project5;

import java.util.Arrays;
import student.TestCase;

/**
 * @author eliza
 * @version 4.21.22
 */
public class CovidCalculatorTest extends TestCase {

    // fields
    private CovidCalculator covid;
    private SinglyLinkedList<Race> raceList;

    /**
     * set up the data for the test class
     */
    public void setUp() {

        SinglyLinkedList<State> states = new SinglyLinkedList<State>();

        raceList = new SinglyLinkedList<Race>();

        Race white = new Race("White", 100, 50);
        Race black = new Race("Black", 100, 40);
        Race latino = new Race("Latino", 100, 30);
        Race asian = new Race("Asian", 100, 20);
        Race other = new Race("Other", 100, 10);
        State dc = new State("DC", raceList);
        State ga = new State("GA", raceList);
        State md = new State("MD", raceList);
        State nc = new State("NC", raceList);
        State tn = new State("TN", raceList);
        State va = new State("VA", raceList);

        states.add(dc);
        states.add(ga);
        states.add(md);
        states.add(nc);
        states.add(tn);
        states.add(va);

        raceList.add(black);
        raceList.add(white);
        raceList.add(latino);
        raceList.add(asian);
        raceList.add(other);

        covid = new CovidCalculator(raceList);
    }


    /**
     * test the sortByAlpha method
     */
    public void testSortByAlpha() {
        
        covid.sortByAlpha(raceList);
        String sameArray =
            "[Asian: 100 cases, 20.0% CFR, Black: 100 cases, 40.0% CFR, "
                + "Latino: 100 cases, 30.0% CFR, Other: 100 cases, 10.0% CFR, "
                + "White: 100 cases, 50.0% CFR]";

        assertEquals(sameArray, Arrays.toString(raceList.toArray()));

        System.out.println(Arrays.toString(raceList.toArray()));

    }


    /**
     * test the sortByCFR method
     */
    public void testSortByCFR() {

        String[] sameArray = { "White: 100 cases, 50.0% CFR",
            "Black: 100 cases, 40.0% CFR", "Latino: 100 cases, 30.0% CFR",
            "Asian: 100 cases, 20.0% CFR", "Other: 100 cases, 10.0% CFR" };
        assertTrue(Arrays.equals(covid.sortByCFR(raceList), sameArray));

    }


    /**
     * test the toArray method
     */
    public void testToArray() {
        String[] array = covid.toArrayString();

        assertEquals(array[1], "White: 100 cases, 50.0% CFR");
        assertEquals(array[0], "Black: 100 cases, 40.0% CFR");
        assertEquals(array[2], "Latino: 100 cases, 30.0% CFR");
        assertEquals(array[3], "Asian: 100 cases, 20.0% CFR");
        assertEquals(array[4], "Other: 100 cases, 10.0% CFR");
    }


    public void testToArrayDouble() {
        double[] array = covid.toArrayDouble();
        assertTrue(array[1] == 50.0);
        assertTrue(array[0] == 40.0);
        assertTrue(array[2] == 30.0);
        assertTrue(array[3] == 20.0);
        assertTrue(array[4] == 10.0);
    }

}
