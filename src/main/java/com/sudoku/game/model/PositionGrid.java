package com.sudoku.game.model;

import com.sudoku.game.model.interfaces.IPosition;

public class PositionGrid implements IPosition{

    private Cell cell;
    private String idGrid;
    private int row;
    private int column;

    public PositionGrid(String idGrid, Cell cell, int row, int column){
        setIdGrid(idGrid);
        setCell(cell);
        setRow(row);
        setColumn(column);
    }

    public PositionGrid(String idGrid, int row, int column){
        setIdGrid(idGrid);
        setRow(row);
        setColumn(column);
    }

    public Cell getCell(){
        return cell;
    }

    public void setCell(Cell cell){
        this.cell = cell;
    }

    public String getIdGrid(){
        return idGrid;
    }

    public void setIdGrid(String idGrid){
        this.idGrid = idGrid;
    }

    @Override
    public int getRow(){
        return this.row;
    }

    @Override
    public void setRow(int row){
        this.row = row;
    }

    @Override
    public int getColumn(){
        return this.column;
    }

    @Override
    public void setColumn(int column){
        this.column = column;
    }

    @Override
    public boolean equalsPosition(IPosition otherPos){
        if(otherPos == null) return false;
        if(this.getColumn() != otherPos.getColumn() && this.getRow() != otherPos.getRow()) return false;
        if(this.getColumn() != otherPos.getColumn() || this.getRow() != otherPos.getRow()) return false;
        return this.getColumn() == otherPos.getColumn() && this.getRow() == otherPos.getRow();
    }

    @Override
    public String toString(){
        return "PositionGrid{" +
                "cell=" + cell +
                ", idGrid='" + idGrid + '\'' +
                ", row=" + row +
                ", column=" + column +
                '}';
    }

}
