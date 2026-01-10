package com.abhishek.flagquiz.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhishek.flagquiz.R;
import com.abhishek.flagquiz.databinding.FragmentHomeBinding;

public class FragmentHome extends Fragment {
    FragmentHomeBinding fragmentHomeBinding;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentHomeBinding =FragmentHomeBinding.inflate(inflater,container,false);
        fragmentHomeBinding.btnStart.setOnClickListener(v ->{
            // navigation
        });
        return fragmentHomeBinding.getRoot();
    }
}