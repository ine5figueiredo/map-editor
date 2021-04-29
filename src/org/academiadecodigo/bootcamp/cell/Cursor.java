package org.academiadecodigo.bootcamp.cell;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    public Cursor() {
        super(0, 0);
        rectangle.setColor(Color.YELLOW);
    }



    public void moveUp() {
        rectangle.translate(0, -CELL_SIZE);
        row--;
    }

    public void moveDown() {
        rectangle.translate(0, CELL_SIZE);
        row++;
    }

    public void moveLeft() {
        rectangle.translate(-CELL_SIZE, 0);
        column--;
    }

    public void moveRight() {
        rectangle.translate(CELL_SIZE, 0);
        column++;
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }


}
