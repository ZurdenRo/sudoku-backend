package com.example.game.designPattern.factory;

import com.example.game.model.Cell;
import com.example.game.model.Grid;

public class GridThree implements  IGrid{

    private Grid grid;

    public Grid getGrid(){
        return grid;
    }

    public void setGrid(Grid grid){
        this.grid = grid;
    }

    public GridThree(){};

    
    @Override
    public void buildGrid(){
       this.setGrid(new Grid());
       this.getGrid().setSubGrid(new Grid.SubGrid[3][3]);
        int totalMatrixCell = 3 * 3;
        for(int i = 0; i < totalMatrixCell ; i++) {
            Cell[][] cellsOne = new Cell[3][3];
            Cell.createMatrix(cellsOne);
            this.getGrid().setCellsOnGrid(cellsOne, i + 1);
        }
        this.getGrid().organizeMatrix();
    }
}
