package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cell.Cell;

public class Grid {

    public static final int PADDING = 10;
    private int columns;
    private int rows;
    private Cell[][] cells;

    public Grid(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;

        cells = new Cell[columns][rows];
    }

    public void init() {
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                cells[column][row] = new Cell(column, row);
                cells[column][row].draw();

            }
        }
    }

    public void clean() {
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                cells[column][row].erase();
            }
        }
    }

    public Cell getCell(int column, int row) {
        return cells[column][row];
    }

    public static int getPADDING() {
        return PADDING;
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }
}
