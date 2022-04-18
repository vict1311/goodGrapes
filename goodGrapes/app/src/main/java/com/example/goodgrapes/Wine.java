package com.example.goodgrapes;

import java.util.ArrayList;

public class Wine {

    //wineID is a String, because we need to use remove() and if it is an int, it removes position not object
    /**
     * ID for a specific wine
     */
    public String wineID;
    /**
     * name of the wine
     */
    public String name;
    /**
     * the type of wine (red, wine, etc.)
     */
    public String type;
    /**
     * the grape of the wine
     */
    public String grape;
    /**
     * the year the wine was produced
     */
    public int year;
    /**
     * libSaved checks for the wine being saved in the user's library (this is done during runtime as a local variable)
     */
    public boolean libSaved;

    /** constructor to create Wine objects
    * @param wineID is a string that is the ID of the wine
    * @param name is a String defining the name
    * @param grape is the grape sort of a Wine
    * @param type is the general type of wine
    * @param year is the release year of the Wine
    * start by defining a wine as NOT saved by setting libSaved to false
    * libSaved is an attribute dynamically evaluated during runtime and NOT saved in database
    * because we can then change libSaved based on the user who is using the app
     */
    public Wine(String wineID, String name, String grape, String type, int year) {
        this.wineID = wineID;
        this.name = name;
        this.grape = grape;
        this.type = type;
        this.year = year;
        libSaved = false;
    }

    /**
    * createWines() handles creating the different Wines of our system
    * sources are from Winefamly.com
    * @return ArrayList of Wines that is added to for every object created
     */
    public static ArrayList<Wine> createWines(){
        ArrayList<Wine> wineList = new ArrayList<Wine>();
        Wine wine1 = new Wine("0", "Barramundi", "Pinot Noir", "Red", 2019);
        wineList.add(wine1);
        Wine wine2 = new Wine("1", "Stepp", "Riesling", "White", 2020);
        wineList.add(wine2);
        Wine wine3 = new Wine("2", "Duckhorn", "Merlot", "Red", 2017);
        wineList.add(wine3);
        return wineList;
    }

    /**
    * Method browseAllWines() gets all wines in the system using createWines()
    * @return ArrayList of Wines
     */
    public static ArrayList<Wine> browseAllWines() {
        ArrayList<Wine> allWines = createWines();
        return allWines;
    }

    /**
    * Method addWineToLibrary() lets users add a Wine to UserLibrary
    * @param wine is a Wine object to be added
    * @param userLib is a UserLibrary the Wine is added to
     */
    public void addWineToLibrary(Wine wine, UserLibrary userLib) {
        wine.libSaved = true;
        userLib.winesInLib.add(wine.wineID);
    }

    /**
    *Method removeWineFromLibrary() lets users remove a Wine from UserLibrary
    * @param wine is a Wine object to be removed
    * @param userLib is a UserLibrary the Wine is removed from
     */
    public void removeWineFromLibrary(Wine wine, UserLibrary userLib) {
        wine.libSaved = false;
        userLib.winesInLib.remove(wine.wineID);
    }

    /**
    *Method findWine() looks for a specific wine in all created Wines
    * @param wineID is a String to be looked for
    * createWines() generates full list of all Wines
    * for loop to go through returned ArrayList of createWines()
    * if the wineID supplied is equal to a given Wine return the given Wine
     */
    public static Wine findWine(String wineID) {
        ArrayList<Wine> wineListAll = createWines();
        for (int i = 0; i < wineListAll.size(); i ++) {
            Wine tempWine = wineListAll.get(i);
            if (wineID == tempWine.wineID) {
                return tempWine;
            }
        }
        return null;
    }
}
