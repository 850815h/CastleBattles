package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomFactory {
    private Scanner scanner;
    private int maxRooms = 2;
    private Room room = new Room();
    private Room[][] rooms = new Room[maxRooms][maxRooms];


    public RoomFactory() {
        adda();
        printRooms();

        //rooms[1][1].setRoomGrid(2, 2);
        //System.out.println(rooms[4][11].toString());
    }

    //ej användbar än!
    private void sortRooms(){

    }

    private void adda() {
        for (int row = 0; row < rooms.length; row++) {
            for (int col = 0; col < rooms[row].length; col++) {
                rooms[row][col] = room;
            }
        }
    }

    private void printRooms(){
        for(int rad = 0 ; rad < rooms.length ; rad++){
            for(int kol = 0 ; kol < rooms[rad].length ; kol++){
                System.out.print(rooms[rad][kol]);
            }
        }

        //Annat sätt att printa ut banan
        /*for(Room[] room : rooms ){
            System.out.print("");
            for(Room r : room ){
                System.out.print(r);
            }
        }*/
    }

    private void maxRooms(int howManyRoomsToAdd) {
        maxRooms = howManyRoomsToAdd;
    }


}
