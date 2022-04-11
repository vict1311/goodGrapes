package com.example.goodgrapes;

import java.util.ArrayList;

public class UserLibrary {
    //we define attributes of the library
    public int userIDLib;
    //we remember to use the wrapper class Integer here
    public ArrayList<Integer> wineList = new ArrayList<Integer>();

    public UserLibrary(User user, ArrayList<Integer> wineList) {
        this.wineList = wineList;
        userIDLib = user.userID;
    }

    public void createLibrary() {
        ArrayList<UserLibrary> userLibraries = new ArrayList<UserLibrary>();
        //TODO 1. make createLibrary, 2. add wines to a library, simulate a run,
    }

    public void browseLibrary() {
        //create wineList using createWines() method
        ArrayList<Wine> wineList = Wine.createWines();
        //for loop to iterate over all wines in wineList
        for (int i = 0; i < wineList.size(); i++) {
            Wine tempWine = wineList.get(i);
            System.out.println(tempWine.name);
            System.out.println(tempWine.year);
        }
    }
}
