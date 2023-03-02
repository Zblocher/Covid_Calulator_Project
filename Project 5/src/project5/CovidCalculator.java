// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(clara21)(elizabethyen25)
package project5;

/**
 * @author eliza
 * @version 2022.04.23
 *
 */
public class CovidCalculator {

    private SinglyLinkedList<Race> races;

    /**
     * Initializes a new CovidCalculator with the given raceList
     * 
     * @param raceList
     *            the raceList provided
     */
    public CovidCalculator(SinglyLinkedList<Race> raceList) {
        this.races = raceList;

    }


    /**
     * Converts the array of races into an array of strings
     * 
     * @return returns the array of strings
     */
    public String[] toArrayString() {

        Race[] raceArray = new Race[races.size()];
        String[] array = new String[raceArray.length];

        for (int i = 0; i < raceArray.length; i++) {
            raceArray[i] = races.get(i);
        }

        for (int i = 0; i < raceArray.length; i++) {
            array[i] = raceArray[i].toString();
        }

        return array;

    }


    /**
     * Converts the array of races into an array of doubles in accordance to
     * their calculated CFR values
     * 
     * @return returns the array of double values
     */
    public double[] toArrayDouble() {

        Race[] raceArray = new Race[races.size()];
        double[] array = new double[raceArray.length];

        for (int i = 0; i < raceArray.length; i++) {
            raceArray[i] = races.get(i);
        }

        for (int i = 0; i < raceArray.length; i++) {
            array[i] = raceArray[i].calculateCFR();
        }

        return array;

    }


    /**
     * Sorts the race array alphabetically
     * 
     * @param array
     *            the array of races being sorted
     */
    public Race[] sortByAlpha(SinglyLinkedList<Race> races1) {

        Race[] array = new Race[races1.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = races1.get(i);
        }

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[j].compareTo(array[i]) < 0) {
                    Race temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }


    public Race[] convertListToArray(SinglyLinkedList<Race> races1) {
        Race[] raceArray = new Race[races.size()];

        for (int i = 0; i < raceArray.length; i++) {
            raceArray[i] = races1.get(i);
        }

        return raceArray;
    }


    /**
     * Sorts the list of races by CFR, highest to lowest
     * 
     * @param races1
     *            the list of races being sorted
     * @return returns a string array of the races sorted
     */
    public Race[] sortByCFR(SinglyLinkedList<Race> races1) {
        Race[] raceArray = new Race[races1.size()];

        for (int i = 0; i < raceArray.length; i++) {
            raceArray[i] = races1.get(i);
        }
        
        boolean sorted = false;
        Race temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < raceArray.length - 1; i++) {
                if (raceArray[i].calculateCFR() < raceArray[i + 1]
                    .calculateCFR()) {
                    temp = raceArray[i];
                    raceArray[i] = raceArray[i + 1];
                    raceArray[i + 1] = temp;
                    sorted = false;
                }
                else if (Math.abs(raceArray[i].calculateCFR() - raceArray[i + 1]
                    .calculateCFR()) < 0.00001 && (raceArray[i].getRace()
                        .compareTo(raceArray[i + 1].getRace()) > 0)) {
                    temp = raceArray[i];
                    raceArray[i] = raceArray[i + 1];
                    raceArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return raceArray;

    }
}
