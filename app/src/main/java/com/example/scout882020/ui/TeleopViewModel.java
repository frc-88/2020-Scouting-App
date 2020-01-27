package com.example.scout882020.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TeleopViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TeleopViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is teleop fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
