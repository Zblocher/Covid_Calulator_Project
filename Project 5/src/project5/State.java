// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(elizabethyen25)(clara21)
package project5;

/**
 * @author Elizabeth Yen (elizabethyen25)
 * @version April 2022
 *
 */
public class State {

    private String name;
    private SinglyLinkedList<Race> races;

    /**
     * 
     * @param name
     *            pass through the states name
     * @param races
     *            pass through the race of the data
     */
    public State(String name, SinglyLinkedList<Race> races) {
        this.name = name;
        this.races = races;
    }


    /**
     * create a method to return the name
     * 
     * @return
     *         return the name
     */
    public String getName() {
        return name;
    }


    /**
     * create a method to return the race
     * 
     * @return
     *         return the race
     */
    public SinglyLinkedList<Race> getRaces() {
        return races;
    }

}