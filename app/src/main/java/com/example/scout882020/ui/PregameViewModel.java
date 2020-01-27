package com.example.scout882020.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PregameViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PregameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is pregame fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
