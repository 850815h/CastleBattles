package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class GameSimulator {
    /*
    Här tänker jag att ALL logik mellan klasserna ska ske. Har du bättre tips så säg gärna till :)
    Än så länge är den tom, men det kommer snart igång ;D
     */

    private static Thread thread = new Thread();
    private static Scanner scanner = new Scanner(System.in);
    private static Random random;
    private boolean quitMenu = false;

    //private String userInput = "";

    public GameSimulator() {
        //new RoomFactory();
        welcomeMessage();
    }

    //
    private void welcomeMessage() {
        System.out.println(
                "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤   W E L C O M E    ¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤        T O         ¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤   CASTLE BATTLE    ¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");
        showMainMenu();
    }

    private void showMainMenu() {
        System.out.printf(
                        "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤ MAIN  MENU ¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤                                          ¤\n" +
                        "¤           [][][]  __  [][][]             ¤\n" +
                        "¤            |::|  |__|  |::|              ¤\n" +
                        "¤            |[]|_|::::|_|[]|              ¤\n" +
                        "¤            |::::::__::::::|              ¤\n" +
                        "¤            |::::: || :::::|              ¤\n" +
                        "¤            |:#:::||||::#::|              ¤\n" +
                        "¤                                          ¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤                                          ¤\n" +
                        "¤  [ 1 ] ...                               ¤\n" +
                        "¤  [ 2 ] ...                               ¤\n" +
                        "¤  [ 3 ] ...                               ¤\n" +
                        "¤  [ 4 ] ...                               ¤\n" +
                        "¤                                          ¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n");

        do {
            switch (userInput()) {
                case "1":
                    showMainMenu();
                    quitMenu = true;
                    break;
                case "2":
                    showMainMenu();
                    break;
                case "3":
                    showMainMenu();
                    break;
                case "4":
                    showMainMenu();
                    break;
                case "5":
                    showMainMenu();
                    break;
                case "6":
                    exitProgram();
                    break;
                default:
                    messagePleaseSelectFromTheMenu();
                    break;
            }
        } while (quitMenu == false);
    }

    private void somethingToDo() {

    }

    private void messagePleaseSelectFromTheMenu() {
        System.out.println("Please choose from the menu!");
    }

    private String userInput() {
        String userInput = scanner.nextLine();
        return userInput;
    }

    //ska experimentera med den här så vi kan få ett snyggt intro och kanske även visa fightscener "live" ;P
    private void welcomeMessage(double welcomeMessageSpeed) throws InterruptedException {
        String[][] menuArrayString =
                {
                        {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]",},
                        {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]",},
                        {"[]", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "[] "},
                        {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "V", "Ä", "L", "K", "O", "M", "M", "E", "N", "[]", "[]", "[]", "[]", "[]", "[]", "[]"},
                        {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "T", "I", "L", "L", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]"},
                        {"[]", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "[] "},
                        {" ", "F", "o", "t", "b", "o", "l", "l", "s", " ", "S", "i", "m", "u", "l", "a", "t", "o", "r", "n", " "},
                        {"[]", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "[] "},
                        {"[]", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "  ", "[] "},
                        {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]",},
                        {"[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]", "[]",},
                };

        String menuString =
                "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤   W E L C O M E    ¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤        T O         ¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤   CASTLE BATTLE    ¤¤¤¤¤¤¤¤¤¤¤¤\n" +
                        "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n";

        String[] parts = menuString.split("");

        for (int i = 0; i < parts.length; i++) {
            int randomNumber = (int) (Math.random() * parts.length);
            delayTimer(.01);
            System.out.print(parts[randomNumber]);
        }

        delayTimer(1);
    }

    private void delayTimer(double howManySecondsToDelay) {
        double wholeSeconds = howManySecondsToDelay * 1000;
        try {
            thread.sleep((long) wholeSeconds);
        } catch (Exception e) {
            System.out.println("TimeLeft");
        }
    }

    private void exitProgram() {
        System.exit(0);
    }








}