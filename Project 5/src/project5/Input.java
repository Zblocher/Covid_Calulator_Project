// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(clara21)(elizabethyen25)
package project5;

import java.io.FileNotFoundException;
import java.text.ParseException;
import project5.SinglyLinkedList.Node;

/**
 * Reads the data files that contain the death and case count for each race in
 * each state.
 * 
 * @author Clara McDaniel (clara21)
 * @version 2022.04.20
 *
 */
public class Input {

    /**
     * Main method of the input class. Runs the final project and displays an
     * output of the data provided sorted in the specified order.
     * 
     * @param args
     *            the parameter of the input
     * @throws FileNotFoundException
     *             if the file is not found
     * @throws ParseException
     *             if there is a parsing error
     */
    public static void main(String[] args) throws FileNotFoundException {

        CovidReader covid = new CovidReader("Cases_and_Deaths_CRDT_NEW.csv");

        SinglyLinkedList<State> states = covid.getStates();

        GUICovidWindow window = new GUICovidWindow(states);

    }
}
