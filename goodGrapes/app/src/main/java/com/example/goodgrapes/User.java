package com.example.goodgrapes;

import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

public class User {
    //initialize attributes for a given user
    public int userID;
    public String name;
    private String username;
    private String password;

    //constructor that sets object attributes as those given as parameters
    public User(int userID, String name, String username, String password) {
        this.userID = userID;
        this.name = name;
        this.username = username;
        this.password = password;


    }

    // method to create users and add these to an ArrayList of users
    public static ArrayList<User> createUsers() {
        ArrayList<User> userList = new ArrayList<User>();
        User userEmmelie = new User(0, "Emmelie Christensen", "okemmelie", "password123");
        userList.add(userEmmelie);
        User userVictor = new User(1, "Victor Jensen", "vict1311", "NyKode5");
        userList.add(userVictor);
        User userLina = new User(2, "Lina Mancini", "lina123", "linaFraVejle");
        userList.add(userLina);
        // return userList
        return userList;
    }
}