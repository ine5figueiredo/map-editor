package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cell.Cursor;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Controller implements KeyboardHandler {

    private Map map;

    public Controller(Map map) {
        this.map = map;
    }

    public void init() {
        Keyboard keyboard = new Keyboard(this);
        int keys[] = {
                KeyboardEvent.KEY_UP,
                KeyboardEvent.KEY_DOWN,
                KeyboardEvent.KEY_LEFT,
                KeyboardEvent.KEY_RIGHT,
        };

        for (int key : keys) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKey(key);
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            keyboard.addEventListener(event);
        }
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                map.moveCursor(Cursor.Direction.UP);
                break;
            case KeyboardEvent.KEY_DOWN:
                map.moveCursor(Cursor.Direction.DOWN);
                break;
            case KeyboardEvent.KEY_LEFT:
                map.moveCursor(Cursor.Direction.LEFT);
                break;
            case KeyboardEvent.KEY_RIGHT:
                map.moveCursor(Cursor.Direction.RIGHT);
                break;
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
