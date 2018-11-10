/*
 *   Use proper naming to describe the intention of the code.
 */

import java.util.ArrayList;
import java.util.List;

public class IntentionRevealingNames {

    int d;  // elapsed time in days

    // instead, declare exactly what the meaning is
    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;


    // Bad.
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }

    // What kinds of things are in the list?
    // What is the significance of the zeroth subscript of an item in theList?
    // What is the significance of the value 4?
    // How would I use the list being returned?

    // Better - Assume this is a minesweeper game.
    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBoard)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }


    // Even better - Assume you made a class Cell.
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
