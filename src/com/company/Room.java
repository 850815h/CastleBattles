package com.company;

public class Room {
    private String[][] roomGrid = {
            {"___", "___", "___","___","___"},
            {"|  ", "   ", "   ","   ","  |"},
            {"|  ", "   ", "   ","   ","  |"},
            {"|  ", "   ", "   ","   ","  |"},
            {"|__", "___", "___","___","__|"}
    };



    public Room(){
        getRoomGrid();
    }

    public String toString(){
        for(String[] row : roomGrid ){
            System.out.println();
            for( String col : row){
                System.out.print(col);
            }
        }

        String result = "";
        return result;
    }

    public void setRoomGrid(int x, int y){
        roomGrid[x][y] = " O ";
    }

    private String[][] getRoomGrid() {
        return roomGrid;
    }
}



/* //Detta är ett annat exempel på hur banan kan se ut ;)
private String[][] roomGrid = {
            {"[ ]", "[ ]", "[ ]","[ ]","[ ]"},
            {"[ ]", "[ ]", "[ ]","[ ]","[ ]"},
            {"[ ]", "[ ]", "[ ]","[ ]","[ ]"},
            {"[ ]", "[ ]", "[ ]","[ ]","[ ]"},
            {"[ ]", "[ ]", "[ ]","[ ]","[ ]"}
    };
 */
