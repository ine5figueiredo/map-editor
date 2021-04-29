package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cell.Cell;
import org.academiadecodigo.bootcamp.cell.Cursor;

public class Map {

    private Cursor cursor;
    private Grid grid;
    private boolean painting;
    private Controller controller;

    public Map(int cols, int rows) {
        cursor = new Cursor();
        grid = new Grid(cols, rows);
        controller = new Controller(this);
        grid.init();
        cursor.paint();
        controller.init();
    }

    public void clear(){
        grid.clean();
    }

    public void paintCell(){
        Cell cell = grid.getCell(cursor.getColumn(),cursor.getRow());

        if (!cell.isPainted()){
            cell.paint();
            return;
        }
        cell.erase();
    }

    public void moveCursor(Cursor.Direction direction){

        if (cursorOnEdge(direction)){

            return;
        }

        switch (direction){
            case UP:
                cursor.moveUp();
                break;
            case DOWN:
                cursor.moveDown();
                break;
            case LEFT:
                cursor.moveLeft();
                break;
            case RIGHT:
                cursor.moveRight();
                break;
        }

        if (painting){
            paintCell();
        }
    }

    private boolean cursorOnEdge(Cursor.Direction direction) {
        return direction == Cursor.Direction.UP && cursor.getRow() == 0 ||
                direction == Cursor.Direction.DOWN && cursor.getRow() == grid.getRows() - 1 ||
                direction == Cursor.Direction.LEFT && cursor.getColumn() == 0 ||
                direction == Cursor.Direction.RIGHT && cursor.getColumn() == grid.getColumns() - 1;
    }

    public void setPainting(boolean painting) {
        this.painting = painting;
    }

}
