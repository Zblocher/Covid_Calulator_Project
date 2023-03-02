// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(clara21)(elizabethyen25)
package project5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.ParseException;

/**
 * Reads the data files that contain the death and case count for each race in
 * each state.
 * 
 * @author Clara McDaniel (clara21)
 * @version 2022.04.20
 *
 */
public class CovidReader {
    private SinglyLinkedList<State> states;
    public static final int NUMBER_STATES = 6;

    /**
     * Constructor of a CovidReader that parses through the given files and
     * assigns the data to separate SinglyLinkedLists for both states and races
     * 
     * @param fileName
     *            the name of the file being read
     * @throws FileNotFoundException
     *             thrown if the file cannot be found
     * @throws ParseException
     *             thrown if there is an error while reading the file
     * 
     * 
     */
    public CovidReader(String fileName) throws FileNotFoundException {
        states = new SinglyLinkedList<State>();
        Scanner scan = new Scanner(new File(fileName));
        String currLine = "";

        currLine = scan.nextLine();

        for (int i = 0; i < NUMBER_STATES; i++) {
            SinglyLinkedList<Race> races = new SinglyLinkedList<Race>();
            currLine = scan.nextLine();
            String[] data = currLine.split(",|\\n|\\r");

            for (int j = 0; j < 5; j++) {
                int infected = checkNoData(data[j + 1]);
                int dead = checkNoData(data[j + 6]);
                String raceN = "";
                if (j == 0) {
                    raceN = "white";
                }
                else if (j == 1) {
                    raceN = "black";
                }
                else if (j == 2) {
                    raceN = "latinx";
                }
                else if (j == 3) {
                    raceN = "asian";
                }
                else {
                    raceN = "other";
                }
                Race race = new Race(raceN, infected, dead);
                races.add(race);

            }
            State state = new State(data[0], races);
            getStates().add(state);

        }
    }


    /**
     * Returns the list of states that are created by the CovidReader.
     * 
     * @return return the list of states
     */
    public SinglyLinkedList<State> getStates() {
        return states;
    }


    /**
     * Checks if any of the data in the file is listed as "NA", or none, and
     * performs the appropriate action given the result
     * 
     * @param data
     *            the data being checked
     * @return returns -1 if the data is NA and the integer value of the data if
     *         it is not
     */
    private int checkNoData(String data) {
        if (data.equals("NA")) {
            return -1;
        }
        else {
            return Integer.valueOf(data);
        }
    }

}