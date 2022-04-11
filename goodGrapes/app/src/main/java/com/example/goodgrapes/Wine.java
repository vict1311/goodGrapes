package com.example.goodgrapes;

import java.util.ArrayList;

public class Wine {

    public int wineID;
    public String name;
    public String type;
    public String grape;
    public int year;
    public boolean libSaved;

    //constructor to create Wine objects
    public Wine(int wineID, String name, String grape, String type, int year) {
        this.wineID = wineID;
        this.name = name;
        this.type = type;
        this.year = year;
        //start by defining a wine as NOT saved
        //libSaved is an attribute dynamically evaluated during runtime and NOT saved in database
        //because we can then change libSaved based on the user who is using the app
        libSaved = false;
    }

    //method for creating wines statically - sources are from Winefamly.com
    public static ArrayList<Wine> createWines(){
        ArrayList<Wine> wineList = new ArrayList<Wine>();
        Wine wine1 = new Wine(0, "Barramundi", "Pinot Noir", "Red", 2019);
        Wine wine2 = new Wine(1, "Stepp", "Riesling", "White", 2020);
        Wine wine3 = new Wine(0, "Duckhorn", "Merlot", "Red", 2017);
    }

    //method to add wine to library
    public void addWineToLibrary(Wine wine, UserLibrary userLib) {
        wine.libSaved = true;
        userLib.wineList.add(wine.wineID);
    }

    public void removeWineFromLibrary(Wine wine, UserLibrary userLib) {
        wine.libSaved = false;
        userLib.wineList.remove(wine.wineID);
    }
}
