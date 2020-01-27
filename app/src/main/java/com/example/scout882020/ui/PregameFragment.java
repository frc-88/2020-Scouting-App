package com.example.scout882020.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.scout882020.R;

public class PregameFragment extends Fragment {

    private PregameViewModel pregameViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pregameViewModel =
                ViewModelProviders.of(this).get(PregameViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pregame, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        pregameViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}