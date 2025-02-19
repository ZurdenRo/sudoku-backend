package com.example.game.pattern.factory;

public class GridFactory{

    private IGrid grid;

    public static IGrid createGridTwo(){
        IGrid grid = new GridTwo();
        grid.buildGrid();
        return grid;
    }

    public static IGrid createGridThree(){
        IGrid grid = new GridThree();
        grid.buildGrid();
        return grid;
    }
}
