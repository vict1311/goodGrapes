package com.example.goodgrapes.ui.Camera;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CameraViewModel extends ViewModel{
    private final MutableLiveData<String> mText;

    public CameraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Good Grapes!");

    }
    public LiveData<String> getText() {
        return mText;
    }
}

