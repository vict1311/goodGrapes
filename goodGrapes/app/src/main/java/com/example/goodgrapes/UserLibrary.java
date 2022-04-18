package com.example.goodgrapes;

import java.util.ArrayList;

public class UserLibrary {
    /**
    * ID of a specific Library
     */
    public int userIDLib;
    /**
    * ArrayList of Wines in a specific UserLibrary
    * we remember to use the wrapper class Integer here
     */
    public ArrayList<String> winesInLib = new ArrayList<String>();

    /**
    * Constructor for a UserLibrary
    * @param user who should be associated with the library by their ID
     */
    public UserLibrary(User user) {
        this.winesInLib = new ArrayList<String>();
        userIDLib = user.userID;
    }

    /**
    * browseLibrary() finds all wines in a user's library to be shown
    * @return ArrayList of Wines
    * create winesInLib using createWines() method
    * for loop to iterate over all wines in winesInLib
    * use findWine to check for the Wine objects that have the same IDs as the one in the UserLibrary
     */
    public ArrayList<Wine> browseLibrary() {
        ArrayList<Wine> winesToPrint = new ArrayList<Wine>();
        for (int i = 0; i < winesInLib.size(); i++) {
            String tempWine = winesInLib.get(i);
            Wine newWineToAdd = Wine.findWine(tempWine);
            winesToPrint.add(newWineToAdd);
        }
        return winesToPrint;
    }
}
