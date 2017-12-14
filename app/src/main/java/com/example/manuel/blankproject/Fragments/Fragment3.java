package com.example.manuel.blankproject.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.manuel.blankproject.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment {

    TextView text3;


    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view3 = inflater.inflate(R.layout.fragment_fragment3, container, false);

        text3 = view3.findViewById(R.id.textfrag1);

        return view3;
    }

}
