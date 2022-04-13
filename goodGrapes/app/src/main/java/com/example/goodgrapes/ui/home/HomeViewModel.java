package com.example.goodgrapes.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.goodgrapes.MainActivity;
import com.example.goodgrapes.User;
import com.example.goodgrapes.UserLibrary;
import com.example.goodgrapes.Wine;

import java.util.*;

import java.util.*;



public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Good Grapes!");


    }

    public LiveData<String> getText() {
        return mText;
    }
}