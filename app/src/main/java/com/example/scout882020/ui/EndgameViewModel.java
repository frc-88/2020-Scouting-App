package com.example.scout882020.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EndgameViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EndgameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is endgame fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}