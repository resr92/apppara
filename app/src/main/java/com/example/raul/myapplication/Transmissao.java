package com.example.raul.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Transmissao extends Fragment {
    public static Transmissao newInstance() {
        Transmissao fragment = new Transmissao();
        return fragment;
    }

    public Transmissao() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_transmissao, container, false);

        return rootView;
    }

}