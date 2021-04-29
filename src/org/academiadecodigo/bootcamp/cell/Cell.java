package org.academiadecodigo.bootcamp.cell;

import org.academiadecodigo.bootcamp.Grid;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    public final int CELL_SIZE = 20;

    protected Rectangle rectangle;
    protected int column;
    protected int row;

    //Only the cell needs to know if is painted or not
    private boolean painted;

    public Cell (int column, int row) {
        this.column = column;
        this.row = row;

        rectangle = new Rectangle((column * CELL_SIZE + Grid.PADDING), (row * CELL_SIZE + Grid.PADDING),
                CELL_SIZE, CELL_SIZE);
        rectangle.setColor(Color.BLACK);

        painted = false;
    }

    public void draw() {
        rectangle.draw();
    }

    public void paint() {
        painted = true;
        rectangle.fill();
    }

    public void erase() {
        painted = false;
        rectangle.draw();
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean isPainted() {
        return painted;
    }
}
