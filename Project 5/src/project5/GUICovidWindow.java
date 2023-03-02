// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor
// and integrity at all times.
// I will not lie, cheat, or steal, nor will
// I accept the actions of those who do.
// (zblocher)(clara21)(elizabethyen25)
package project5;

import java.awt.Color;
import java.text.DecimalFormat;
import cs2.Button;
import cs2.Shape;
import cs2.TextShape;
import cs2.Window;
import cs2.WindowSide;

/**
 * @author Zach Blocher (zblocher)
 * @version 4.24.22
 */
public class GUICovidWindow {
    private SinglyLinkedList<State> states;
    private Window window;

    private int index;
    /**
     * Create a constant for the bars width
     */
    private static final int WIDTH = 10;
    /**
     * create a constant distance between the bars
     */
    private static final int AXIS = 100;
    /**
     * Create a constant for the bar height
     */
    private static final int DISTANCE = 115;

    /**
     * Create the constructor for the window
     * 
     * @param stateData
     *            pass through the list of states from the file
     */
    public GUICovidWindow(SinglyLinkedList<State> stateData) {
        states = stateData;
        window = new Window();

        index = 0;

        Button sortByAlphaButton = new Button("Sort by Alpha");
        sortByAlphaButton.onClick(this, "clickedAlpha");
        window.addButton(sortByAlphaButton, WindowSide.NORTH);

        Button sortByCFRButton = new Button("Sort by CFR");
        sortByCFRButton.onClick(this, "clickedCFR");
        window.addButton(sortByCFRButton, WindowSide.NORTH);

        Button quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);

        Button gaButton = new Button("GA");
        gaButton.onClick(this, "clickedGA");
        window.addButton(gaButton, WindowSide.SOUTH);

        Button dcButton = new Button("DC");
        dcButton.onClick(this, "clickedDC");
        window.addButton(dcButton, WindowSide.SOUTH);

        Button ncButton = new Button("NC");
        ncButton.onClick(this, "clickedNC");
        window.addButton(ncButton, WindowSide.SOUTH);

        Button tnButton = new Button("TN");
        tnButton.onClick(this, "clickedTN");
        window.addButton(tnButton, WindowSide.SOUTH);

        Button mdButton = new Button("MD");
        mdButton.onClick(this, "clickedMD");
        window.addButton(mdButton, WindowSide.SOUTH);

        Button vaButton = new Button("VA");
        vaButton.onClick(this, "clickedVA");
        window.addButton(vaButton, WindowSide.SOUTH);

    }


    /**
     * create a method to add all the bars and text on the window
     * 
     * @param races
     *            pass through the sorted race list
     */
    public void Design(Race[] races) {

        int race1Height = (int)(Math.round(10 * races[0].calculateCFR()));
        int race1Y = DISTANCE + (100 - race1Height);
        Shape bar1 = new Shape(AXIS * 1, race1Y, WIDTH, race1Height, Color.RED);
        TextShape text1 = new TextShape(AXIS * 1 - 15, DISTANCE + 110, races[0]
            .getRace());
        if (races[0].calculateCFR() == -1.0) {
            TextShape cfrText = new TextShape(AXIS * 1 - 15, DISTANCE + 135,
                "NA");
            window.addShape(cfrText);
        }
        else {
            TextShape cfrText = new TextShape(AXIS * 1 - 15, DISTANCE + 135,
                races[0].calculateCFR() + "%");
            window.addShape(cfrText);
        }

        int race2Height = (int)(Math.round(10 * races[1].calculateCFR()));
        int race2Y = DISTANCE + (100 - race2Height);
        Shape bar2 = new Shape(AXIS * 2, race2Y, WIDTH, race2Height, Color.RED);
        TextShape text2 = new TextShape(AXIS * 2 - 15, DISTANCE + 110, races[1]
            .getRace());
        if (races[1].calculateCFR() == -1.0) {
            TextShape cfrText2 = new TextShape(AXIS * 2 - 15, DISTANCE + 135,
                "NA");
            window.addShape(cfrText2);
        }
        else {
            TextShape cfrText2 = new TextShape(AXIS * 2 - 15, DISTANCE + 135,
                races[1].calculateCFR() + "%");
            window.addShape(cfrText2);
        }

        int race3Height = (int)(Math.round(10 * races[2].calculateCFR()));
        int race3Y = DISTANCE + (100 - race3Height);
        Shape bar3 = new Shape(AXIS * 3, race3Y, WIDTH, race3Height, Color.RED);
        TextShape text3 = new TextShape(AXIS * 3 - 15, DISTANCE + 110, races[2]
            .getRace());
        if (races[2].calculateCFR() == -1.0) {
            TextShape cfrText3 = new TextShape(AXIS * 3 - 15, DISTANCE + 135,
                "NA");
            window.addShape(cfrText3);
        }
        else {
            TextShape cfrText3 = new TextShape(AXIS * 3 - 15, DISTANCE + 135,
                races[2].calculateCFR() + "%");
            window.addShape(cfrText3);
        }

        int race4Height = (int)(Math.round(10 * races[3].calculateCFR()));
        int race4Y = DISTANCE + (100 - race4Height);
        Shape bar4 = new Shape(AXIS * 4, race4Y, WIDTH, race4Height, Color.RED);
        TextShape text4 = new TextShape(AXIS * 4 - 15, DISTANCE + 110, races[3]
            .getRace());
        if (races[3].calculateCFR() == -1.0) {
            TextShape cfrText4 = new TextShape(AXIS * 4 - 15, DISTANCE + 135,
                "NA");
            window.addShape(cfrText4);
        }
        else {
            TextShape cfrText4 = new TextShape(AXIS * 4 - 15, DISTANCE + 135,
                races[3].calculateCFR() + "%");
            window.addShape(cfrText4);
        }

        int race5Height = (int)(Math.round(10 * races[4].calculateCFR()));
        int race5Y = DISTANCE + (100 - race5Height);
        Shape bar5 = new Shape(AXIS * 5, race5Y, WIDTH, race5Height, Color.RED);
        TextShape text5 = new TextShape(AXIS * 5 - 15, DISTANCE + 110, races[4]
            .getRace());
        if (races[4].calculateCFR() == -1.0) {
            TextShape cfrText5 = new TextShape(AXIS * 5 - 15, DISTANCE + 135,
                "NA");
            window.addShape(cfrText5);

        }
        else {
            TextShape cfrText5 = new TextShape(AXIS * 5 - 15, DISTANCE + 135,
                races[4].calculateCFR() + "%");
            window.addShape(cfrText5);
        }

        window.addShape(bar1);
        window.addShape(bar2);
        window.addShape(bar3);
        window.addShape(bar4);
        window.addShape(bar5);
        window.addShape(text1);
        window.addShape(text2);
        window.addShape(text3);
        window.addShape(text4);
        window.addShape(text5);

    }


    /**
     * create the header for each state at the top
     * 
     * @param name
     *            pass through the state name
     */
    public void setHeader(String name) {
        TextShape title = new TextShape(0, 0, name + " CFR rate by Race");
        int x = (window.getGraphPanelWidth() / 2) - (title.getWidth() / 2);
        int y = 20;
        title.moveTo(x, y);
        window.addShape(title);
    }


    /**
     * Create the method for when you click GA
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedGA(Button button) {
        window.removeAllShapes();
        index = 1;
        setHeader("GA");
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click DC
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedDC(Button button) {
        window.removeAllShapes();
        index = 0;
        setHeader("DC");
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click MD
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedMD(Button button) {
        window.removeAllShapes();
        index = 2;
        setHeader("MD");
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click NC
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedNC(Button button) {
        window.removeAllShapes();
        index = 3;
        setHeader("NC");
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click VA
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedVA(Button button) {
        window.removeAllShapes();
        index = 5;
        setHeader("VA");
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click TN
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedTN(Button button) {
        window.removeAllShapes();
        index = 4;
        setHeader("TN");
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click quit
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * Create the method for when you click Alpha
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedAlpha(Button button) {
        window.removeAllShapes();
        if (index == 0) {
            setHeader("DC");
        }
        else if (index == 1) {
            setHeader("GA");
        }
        else if (index == 2) {
            setHeader("MD");
        }
        else if (index == 3) {
            setHeader("NC");
        }
        else if (index == 4) {
            setHeader("TN");
        }
        else {
            setHeader("VA");
        }
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByAlpha(states.get(index).getRaces()));
    }


    /**
     * Create the method for when you click CFR
     * 
     * @param button
     *            pass through the button to click
     */
    public void clickedCFR(Button button) {
        window.removeAllShapes();
        if (index == 0) {
            setHeader("DC");
        }
        else if (index == 1) {
            setHeader("GA");
        }
        else if (index == 2) {
            setHeader("MD");
        }
        else if (index == 3) {
            setHeader("NC");
        }
        else if (index == 4) {
            setHeader("TN");
        }
        else {
            setHeader("VA");
        }
        CovidCalculator calc = new CovidCalculator(states.get(index)
            .getRaces());
        Design(calc.sortByCFR(states.get(index).getRaces()));
    }

}
