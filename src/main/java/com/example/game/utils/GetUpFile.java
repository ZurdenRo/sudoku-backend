package com.example.game.utils;

import com.example.game.model.Cell;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class GetUpFile{

    public static void upFile(Cell[][] cOne, Cell[][] cTwo, Cell[][] cThree, Cell[][] cFour, Cell[][] fiv, Cell[][] six, Cell[][] sev, Cell[][] eight, Cell[][] nine) throws IOException{
        List<String> ls = Files.readAllLines(new File("src/main/java/resources/three.csv").toPath());
        int i = 0;
        boolean canBreak = false;
        for(String rec : ls){
            if(i < 9){
                for(int j = 0; j < cOne.length; j++) {
                    for(int k = 0; k < cOne[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(cOne[j][k] == null){
                            cOne[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 18){
                for(int j = 0; j < cTwo.length; j++) {
                    for(int k = 0; k < cTwo[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(cTwo[j][k] == null){
                            cTwo[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 27){
                for(int j = 0; j < cThree.length; j++) {
                    for(int k = 0; k < cThree[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(cThree[j][k] == null){
                            cThree[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 36){
                for(int j = 0; j < cFour.length; j++) {
                    for(int k = 0; k < cFour[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(cFour[j][k] == null){
                            cFour[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 45){
                for(int j = 0; j < fiv.length; j++) {
                    for(int k = 0; k < fiv[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(fiv[j][k] == null){
                            fiv[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 54){
                for(int j = 0; j < six.length; j++) {
                    for(int k = 0; k < six[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(six[j][k] == null){
                            six[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 63){
                for(int j = 0; j < sev.length; j++) {
                    for(int k = 0; k < sev[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(sev[j][k] == null){
                            sev[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 72){
                for(int j = 0; j < eight.length; j++) {
                    for(int k = 0; k < eight[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(eight[j][k] == null){
                            eight[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }else if(i < 81){
                for(int j = 0; j < nine.length; j++) {
                    for(int k = 0; k < nine[j].length; k++) {
                        String[] arr = rec.split(",");
                        if(nine[j][k] == null){
                            nine[j][k] = new Cell(Integer.parseInt(arr[0]),Boolean.parseBoolean(arr[1]), Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
                            canBreak = true;
                        }
                        if(canBreak) break;
                    }
                    if(canBreak) break;
                }
            }
            i++;
            canBreak = false;
        }
    }

}
