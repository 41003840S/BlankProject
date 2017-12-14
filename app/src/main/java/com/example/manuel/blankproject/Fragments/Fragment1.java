package com.example.manuel.blankproject.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.manuel.blankproject.R;


public class Fragment1 extends Fragment {

    TextView text1;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view1 =  inflater.inflate(R.layout.fragment_fragment1, container, false);

        text1 = view1.findViewById(R.id.textfrag1);

        return view1;
    }

}
