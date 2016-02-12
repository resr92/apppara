package com.example.raul.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Publico extends Fragment {

    public static Publico newInstance() {
            Publico fragment = new Publico();
            return fragment;
    }

    public Publico(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_publico, container, false);

        WebView wv25 = (WebView) rootView.findViewById(R.id.webView25);

        WebSettings ws25 = wv25.getSettings();
        ws25.setJavaScriptEnabled(true);
        ws25.setSupportZoom(false);

        wv25.loadUrl("http://resr92.esy.es/publico/index.html");

        return rootView;
    }
}
