package junglesweeper.gameobjects;
import junglesweeper.grid.Grid;
import java.util.ArrayList;
import java.util.Stack;

/**
 * A/C - bootcamp8
 * Project: JungleSweeper
 * Created by: andre martins, fabio fernandes, joao fazenda, nelson pereira, paulo sousa.
 */

public class GameObjectFactory {

    public static GameObject create(int col, int row, Grid grid, GameObjectsType gameObjectsType, ArrayList<Stack<GameObject>> stackArrayList) {
        GameObject object;

        switch (gameObjectsType) {
            case KEY:
                if (stackArrayList.get(0).empty()) {
                    return new Key(grid.makeGridPosition(col, row, GameObjectsType.KEY.getImagePath()));
                }
                object = stackArrayList.get(0).pop();
                object.getGridPosition().setPos(col, row);
                return object;

            case PATH:
                if (stackArrayList.get(1).empty()) {
                    return new Path(grid.makeGridPosition(col, row, GameObjectsType.PATH.getImagePath()));
                }
                object = stackArrayList.get(1).pop();
                object.getGridPosition().setPos(col, row);
                return object;

            case OBSTACLE:
                if (stackArrayList.get(2).empty()) {
                    return new Obstacle(grid.makeGridPosition(col, row, GameObjectsType.OBSTACLE.getImagePath()));
                }
                object = stackArrayList.get(2).pop();
                object.getGridPosition().setPos(col, row);
                return object;

            case ENEMY:
                if (stackArrayList.get(3).empty()) {
                    return new Enemy(grid.makeGridPosition(col, row, GameObjectsType.ENEMY.getImagePath()));
                }
                object = stackArrayList.get(3).pop();
                object.getGridPosition().setPos(col, row);
                return object;

            case DOOR:
                if (stackArrayList.get(4).empty()) {
                    return new Door(grid.makeGridPosition(col, row, GameObjectsType.DOOR.getImagePath()));
                }
                object = stackArrayList.get(4).pop();
                object.getGridPosition().setPos(col, row);
                return object;

            default:
                System.out.println("Something went terribly wrong!");

                if (stackArrayList.get(1).empty()) {
                    return new Path(grid.makeGridPosition(col, row, GameObjectsType.PATH.getImagePath()));
                }

                object = stackArrayList.get(1).pop();
                object.getGridPosition().setPos(col, row);

                return object;
        }
    }
}
