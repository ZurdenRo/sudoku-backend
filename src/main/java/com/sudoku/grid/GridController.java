package com.sudoku.grid;



import com.sudoku.game.pattern.factory.IGrid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/grid")
public class GridController{


    private final GridService gridService;

    @Autowired
    public GridController(){
        this.gridService = new GridService();
    }

    @GetMapping(path = "three")
    public IGrid createGridThree(){
        return this.gridService.makeGridThree();
    }

    @GetMapping(path = "two")
    public IGrid createGridTwo(){
        return this.gridService.makeGridTwo();
    }

}
