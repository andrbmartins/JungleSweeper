package junglesweeper.gameobjects;

import junglesweeper.grid.position.GridPosition;

/**
 * A/C - bootcamp8
 * Project: JungleSweeper
 * Created by: andre martins, fabio fernandes, joao fazenda, nelson pereira, paulo sousa.
 */

public class Tiger extends GameObject {

    public Tiger(GridPosition pos) {
        super(pos, GameObjectsType.TIGER);
    }

    @Override
    public void collide() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isActive() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void reset() {
        // Nothing to execute
    }

    @Override
    public GridPosition getPos() {
        return getGridPosition();
    }
}
