package com.sudoku.game.model.interfaces;

public interface IPosition{

    int getRow();
    void setRow(int row);

    int getColumn();
    void setColumn(int column);

    boolean equalsPosition(IPosition otherPos);
}
