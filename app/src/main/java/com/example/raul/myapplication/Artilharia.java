package com.example.raul.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Artilharia extends Fragment {
    public static Artilharia newInstance() {
        Artilharia fragment = new Artilharia();
        return fragment;
    }

    public Artilharia() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_artilharia, container, false);

        WebView wv21 = (WebView) rootView.findViewById(R.id.webView21);

        WebSettings ws21 = wv21.getSettings();
        ws21.setJavaScriptEnabled(true);
        ws21.setSupportZoom(false);

        wv21.loadUrl("http://resr92.esy.es/artilharia/index.html");

        return rootView;
    }
}
