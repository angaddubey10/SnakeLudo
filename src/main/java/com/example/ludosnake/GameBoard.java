package com.example.ludosnake;

import javafx.scene.paint.Paint;
import javafx.util.Pair;

import java.util.ArrayList;

public class GameBoard {
    static int  tileSize = 40;
    static int height = 10;
    static int width = 10;
    static ArrayList<Pair<Integer,Integer>>positionCoordinates;
    static ArrayList<Integer>snakeLadderPosition;

   static private void populatePositionCoordinate(){
        positionCoordinates = new ArrayList<>();
        positionCoordinates.add(new Pair<Integer,Integer>(20,380));
        for (int i = height-1; i>=0 ; i--) {
            for (int j = width-1; j>=0 ; j--) {
                int xTilePos, yTilePos, pos;
                if(i%2 != 0){
                    xTilePos = tileSize*width - (tileSize/2 + j*tileSize);
                }
                else{
                    xTilePos = tileSize/2 + j*tileSize;
                }
                yTilePos = tileSize/2 + i*tileSize;
                positionCoordinates.add(new Pair<>(xTilePos,yTilePos));
            }
        }

        for (int i = 0; i <positionCoordinates.size(); i++) {
            System.out.println(i + " x: " + positionCoordinates.get(i).getKey() + " y: " + positionCoordinates.get(i).getValue());
        }


    }


    public static void main(String[] args) {
        populatePositionCoordinate();
    }

}
