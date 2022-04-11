package com.example.goodgrapes.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.goodgrapes.MainActivity;
import com.example.goodgrapes.User;
import com.example.goodgrapes.Wine;

import java.util.*;

import java.util.*;



public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {

        mText = new MutableLiveData<>();

        //create userList
        ArrayList<User> userList = User.createUsers();
        //find user at position 0 and convert ID to String
        User user1 = userList.get(0);
        String newID = String.valueOf(user1.userID);
        mText.setValue(newID + user1.name);

        //create our wines
        Wine.createWines();


    }

    public LiveData<String> getText() {
        return mText;
    }
}