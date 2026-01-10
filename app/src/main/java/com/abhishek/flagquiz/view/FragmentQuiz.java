package com.abhishek.flagquiz.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abhishek.flagquiz.R;
import com.abhishek.flagquiz.databinding.FragmentQuizBinding;


public class FragmentQuiz extends Fragment {
    FragmentQuizBinding fragmentQuizBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentQuizBinding =FragmentQuizBinding.inflate(inflater,container,false);
        fragmentQuizBinding.buttonA.setOnClickListener(v->{

        });
        fragmentQuizBinding.buttonB.setOnClickListener(v->{

        });
        fragmentQuizBinding.buttonC.setOnClickListener(v->{

        });
        fragmentQuizBinding.buttonD.setOnClickListener(v->{

        });
        fragmentQuizBinding.buttonNext.setOnClickListener(v->{

        });
        return fragmentQuizBinding.getRoot();
    }
}