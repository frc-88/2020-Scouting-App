package com.example.scout882020.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AutoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is auto fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
