package com.sudoku.services.grid;

import com.sudoku.game.pattern.factory.GridFactory;
import com.sudoku.game.pattern.factory.IGrid;
import org.springframework.stereotype.Service;

@Service
public class GridService{


    public IGrid makeGridThree(){
        return GridFactory.createGridThree();
    }

    public IGrid makeGridTwo(){
        return GridFactory.createGridTwo();
    }

}
