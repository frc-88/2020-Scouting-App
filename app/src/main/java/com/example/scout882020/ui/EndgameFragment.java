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

public class EndgameFragment extends Fragment {

    private EndgameViewModel endgameViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        endgameViewModel =
                ViewModelProviders.of(this).get(EndgameViewModel.class);
        View root = inflater.inflate(R.layout.fragment_endgame, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        endgameViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
