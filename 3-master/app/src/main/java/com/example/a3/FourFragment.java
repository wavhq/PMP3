package com.example.a3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3.databinding.FragmentFourBinding;


public class FourFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentFourBinding binding = FragmentFourBinding.inflate(getLayoutInflater());
        binding.button3.setOnClickListener(view -> {
            Bundle result = new Bundle();
            result.putString("bundleKey", "Результат нижнего фрагмента");
            getParentFragmentManager().setFragmentResult(
                    "requestKey", result
            );
        });
        return binding.getRoot();
    }
}