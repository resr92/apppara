package com.example.raul.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Classificação extends Fragment {

    public static Classificação newInstance() {
        Classificação fragment = new Classificação();
        return fragment;
    }

    public Classificação() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_classificacao, container, false);

        WebView wv = (WebView) rootView.findViewById(R.id.webView);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("http://resr92.esy.es/tablesorter/index.html");

        WebView wv2 = (WebView) rootView.findViewById(R.id.webView2);

        WebSettings ws2 = wv2.getSettings();
        ws2.setJavaScriptEnabled(true);
        ws2.setSupportZoom(false);

        wv2.loadUrl("http://resr92.esy.es/tablesorter2/index.html");


        return rootView;
    }

}
