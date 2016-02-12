package com.example.raul.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Raul on 10/02/2016.
 */
public class Tabela2 extends Fragment {

    public static Tabela2 newInstace(){
        Tabela2 fragment = new Tabela2();
        return fragment;
    }

    public Tabela2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabela2, container, false);
        return rootView;
    }
}
