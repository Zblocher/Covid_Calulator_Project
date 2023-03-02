// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(elizabethyen25)(clara21)
package project5;

import java.text.DecimalFormat;

/**
 * @author eliza
 * @version 2022.04.22
 *
 */
public class Race implements Comparable<Race> {

    private String race1;
    private int infected;
    private int dead;

    /**
     * 
     * @param race
     *            pass through the race
     * @param infected
     *            pass through number of infected
     * @param dead
     *            pass through number of dead
     */
    public Race(String race, int infected, int dead) {
        this.race1 = race;
        this.infected = infected;
        this.dead = dead;
    }


    /**
     * return the race
     * 
     * @return
     *         return the race
     */
    public String getRace() {
        return race1;
    }


    /**
     * return the infected
     * 
     * @return
     *         return the infected
     */
    public int getInfected() {
        return infected;
    }


    /**
     * return the dead
     * 
     * @return
     *         return the dead
     */
    public int getDead() {
        return dead;
    }


    /**
     * calculate the fatality rate
     * 
     * @return
     *         return the fatality rate
     */
    public double calculateCFR() {
        if (getInfected() == -1 || getDead() == -1) {
            return -1;
        }

        DecimalFormat cfrFormat = new DecimalFormat("#.#");

        double cfr = ((double)getDead() / (double)getInfected()) * 100;

        double dCfr = Double.parseDouble(cfrFormat.format(cfr));
        return dCfr;

    }


    /**
     * compare one race to another
     * 
     * @return -1 is this races comes before other race alphabetically
     *         1 if this races comes after other race alphabetically
     *         0 if the races are the same alphabetically
     */
    @Override
    public int compareTo(Race other) {

        // this race comes alphabetically before other race
        if (this.race1.compareTo(other.race1) < 0) {
            return -1;
        }
        // this race comes alphabetically after other race
        else if (this.race1.compareTo(other.race1) > 0) {
            return 1;
        }
        return 0;
    }


    /**
     * create the to string method to output the data
     * 
     * @return returns the string value of the race
     */
    public String toString() {
        if (Math.abs(calculateCFR() - -1) < 0.00001) {
            return "" + race1 + ": " + infected + " cases, " + -1 + "% CFR";

        }
        else if (Math.abs(calculateCFR() - 1) < 0.00001) {
            return "" + race1 + ": " + infected + " cases, " + 1 + "% CFR";

        }
        else if (Math.abs(calculateCFR() - 25) < 0.00001) {
            return "" + race1 + ": " + infected + " cases, " + 25 + "% CFR";

        }
        else {
            return "" + race1 + ": " + infected + " cases, " + calculateCFR()
                + "% CFR";
        }
    }

}