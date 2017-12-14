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
public class Fragment2 extends Fragment {

    TextView text2;

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_fragment2, container, false);

        text2 = view2.findViewById(R.id.textfrag1);

        return view2;
    }

}
