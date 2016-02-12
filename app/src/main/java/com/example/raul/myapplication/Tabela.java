package com.example.raul.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class Tabela extends Fragment {

    public static Tabela newInstance() {
        Tabela fragment = new Tabela();
        return fragment;
    }

    public Tabela() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabela, container, false);

        WebView wv3 = (WebView) rootView.findViewById(R.id.webView3);

        WebSettings ws3 = wv3.getSettings();
        ws3.setJavaScriptEnabled(true);
        ws3.setSupportZoom(false);

        wv3.loadUrl("http://resr92.esy.es/goltime1.html");

        WebView wv4 = (WebView) rootView.findViewById(R.id.webView4);

        WebSettings ws4 = wv4.getSettings();
        ws4.setJavaScriptEnabled(true);
        ws4.setSupportZoom(false);

        wv4.loadUrl("http://resr92.esy.es/goltime2.html");

        WebView wv5 = (WebView) rootView.findViewById(R.id.webView5);

        WebSettings ws5 = wv5.getSettings();
        ws5.setJavaScriptEnabled(true);
        ws5.setSupportZoom(false);

        wv5.loadUrl("http://resr92.esy.es/goltime3.html");

        WebView wv6 = (WebView) rootView.findViewById(R.id.webView6);

        WebSettings ws6 = wv6.getSettings();
        ws6.setJavaScriptEnabled(true);
        ws6.setSupportZoom(false);

        wv6.loadUrl("http://resr92.esy.es/goltime4.html");

        WebView wv7 = (WebView) rootView.findViewById(R.id.webView7);

        WebSettings ws7 = wv7.getSettings();
        ws7.setJavaScriptEnabled(true);
        ws7.setSupportZoom(false);

        wv7.loadUrl("http://resr92.esy.es/goltime5.html");

        WebView wv8 = (WebView) rootView.findViewById(R.id.webView8);

        WebSettings ws8 = wv8.getSettings();
        ws8.setJavaScriptEnabled(true);
        ws8.setSupportZoom(false);

        wv8.loadUrl("http://resr92.esy.es/goltime6.html");

        WebView wv9 = (WebView) rootView.findViewById(R.id.webView9);

        WebSettings ws9 = wv9.getSettings();
        ws9.setJavaScriptEnabled(true);
        ws9.setSupportZoom(false);

        wv9.loadUrl("http://resr92.esy.es/goltime7.html");

        WebView wv10 = (WebView) rootView.findViewById(R.id.webView10);

        WebSettings ws10 = wv10.getSettings();
        ws10.setJavaScriptEnabled(true);
        ws10.setSupportZoom(false);

        wv10.loadUrl("http://resr92.esy.es/goltime8.html");

        WebView wv11 = (WebView) rootView.findViewById(R.id.webView11);

        WebSettings ws11 = wv11.getSettings();
        ws11.setJavaScriptEnabled(true);
        ws11.setSupportZoom(false);

        wv11.loadUrl("http://resr92.esy.es/goljogo5-sfran.html");

        WebView wv12 = (WebView) rootView.findViewById(R.id.webView12);

        WebSettings ws12 = wv12.getSettings();
        ws12.setJavaScriptEnabled(true);
        ws12.setSupportZoom(false);

        wv12.loadUrl("http://resr92.esy.es/goljogo5-remo.html");

        WebView wv13 = (WebView) rootView.findViewById(R.id.webView13);

        WebSettings ws13 = wv13.getSettings();
        ws13.setJavaScriptEnabled(true);
        ws13.setSupportZoom(false);

        wv13.loadUrl("http://resr92.esy.es/goljogo6-aguia.html");

        WebView wv14 = (WebView) rootView.findViewById(R.id.webView14);

        WebSettings ws14 = wv14.getSettings();
        ws14.setJavaScriptEnabled(true);
        ws14.setSupportZoom(false);

        wv14.loadUrl("http://resr92.esy.es/goljogo6-par.html");

        WebView wv15 = (WebView) rootView.findViewById(R.id.webView15);

        WebSettings ws15 = wv15.getSettings();
        ws15.setJavaScriptEnabled(true);
        ws15.setSupportZoom(false);

        wv15.loadUrl("http://resr92.esy.es/goljogo7-pgm.html");

        WebView wv16 = (WebView) rootView.findViewById(R.id.webView16);

        WebSettings ws16 = wv16.getSettings();
        ws16.setJavaScriptEnabled(true);
        ws16.setSupportZoom(false);

        wv16.loadUrl("http://resr92.esy.es/goljogo7-sra.html");

        WebView wv17 = (WebView) rootView.findViewById(R.id.webView17);

        WebSettings ws17 = wv17.getSettings();
        ws17.setJavaScriptEnabled(true);
        ws17.setSupportZoom(false);

        wv17.loadUrl("http://resr92.esy.es/goljogo8-ind.html");

        WebView wv18 = (WebView) rootView.findViewById(R.id.webView18);

        WebSettings ws18 = wv18.getSettings();
        ws18.setJavaScriptEnabled(true);
        ws18.setSupportZoom(false);

        wv18.loadUrl("http://resr92.esy.es/goljogo8-psc.html");

        WebView wv19 = (WebView) rootView.findViewById(R.id.webView19);

        WebSettings ws19 = wv19.getSettings();
        ws19.setJavaScriptEnabled(true);
        ws19.setSupportZoom(false);

        wv19.loadUrl("http://resr92.esy.es/goljogo9-tap.html");

        WebView wv20 = (WebView) rootView.findViewById(R.id.webView20);

        WebSettings ws20 = wv20.getSettings();
        ws20.setJavaScriptEnabled(true);
        ws20.setSupportZoom(false);

        wv20.loadUrl("http://resr92.esy.es/goljogo9-ind.html");

        WebView wv23 = (WebView) rootView.findViewById(R.id.webView23);

        WebSettings ws23 = wv23.getSettings();
        ws23.setJavaScriptEnabled(true);
        ws23.setSupportZoom(false);

        wv23.loadUrl("http://resr92.esy.es/goljogo10-cam.html");

        WebView wv24 = (WebView) rootView.findViewById(R.id.webView24);

        WebSettings ws24 = wv24.getSettings();
        ws24.setJavaScriptEnabled(true);
        ws24.setSupportZoom(false);

        wv24.loadUrl("http://resr92.esy.es/goljogo10-agu.html");

        WebView wv22 = (WebView) rootView.findViewById(R.id.webView22);

        WebSettings ws22 = wv22.getSettings();
        ws22.setJavaScriptEnabled(true);
        ws22.setSupportZoom(false);

        wv22.loadUrl("http://resr92.esy.es/goljogo11-par.html");

        WebView wv26 = (WebView) rootView.findViewById(R.id.webView26);

        WebSettings ws26 = wv26.getSettings();
        ws26.setJavaScriptEnabled(true);
        ws26.setSupportZoom(false);

        wv26.loadUrl("http://resr92.esy.es/goljogo11-sfr.html");

        WebView wv27 = (WebView) rootView.findViewById(R.id.webView27);

        WebSettings ws27 = wv27.getSettings();
        ws27.setJavaScriptEnabled(true);
        ws27.setSupportZoom(false);

        wv27.loadUrl("http://resr92.esy.es/goljogo12-sra.html");

        WebView wv28 = (WebView) rootView.findViewById(R.id.webView28);

        WebSettings ws28 = wv28.getSettings();
        ws28.setJavaScriptEnabled(true);
        ws28.setSupportZoom(false);

        wv28.loadUrl("http://resr92.esy.es/goljogo12-psc.html");

        WebView wv29 = (WebView) rootView.findViewById(R.id.webView29);

        WebSettings ws29 = wv29.getSettings();
        ws29.setJavaScriptEnabled(true);
        ws29.setSupportZoom(false);

        wv29.loadUrl("http://resr92.esy.es/goljogo13-rem.html");

        WebView wv30 = (WebView) rootView.findViewById(R.id.webView30);

        WebSettings ws30 = wv30.getSettings();
        ws30.setJavaScriptEnabled(true);
        ws30.setSupportZoom(false);

        wv30.loadUrl("http://resr92.esy.es/goljogo13-par.html");

        WebView wv31 = (WebView) rootView.findViewById(R.id.webView31);

        WebSettings ws31 = wv31.getSettings();
        ws31.setJavaScriptEnabled(true);
        ws31.setSupportZoom(false);

        wv31.loadUrl("http://resr92.esy.es/goljogo14-pgm.html");

        WebView wv32 = (WebView) rootView.findViewById(R.id.webView32);

        WebSettings ws32 = wv32.getSettings();
        ws32.setJavaScriptEnabled(true);
        ws32.setSupportZoom(false);

        wv32.loadUrl("http://resr92.esy.es/goljogo14-tap.html");

        WebView wv33 = (WebView) rootView.findViewById(R.id.webView33);

        WebSettings ws33 = wv33.getSettings();
        ws33.setJavaScriptEnabled(true);
        ws33.setSupportZoom(false);

        wv33.loadUrl("http://resr92.esy.es/goljogo15-sra.html");

        WebView wv34 = (WebView) rootView.findViewById(R.id.webView34);

        WebSettings ws34 = wv34.getSettings();
        ws34.setJavaScriptEnabled(true);
        ws34.setSupportZoom(false);

        wv34.loadUrl("http://resr92.esy.es/goljogo15-ind.html");

        WebView wv35 = (WebView) rootView.findViewById(R.id.webView22);

        WebSettings ws35 = wv35.getSettings();
        ws35.setJavaScriptEnabled(true);
        ws35.setSupportZoom(false);

        wv35.loadUrl("http://resr92.esy.es/goljogo16-sfr.html");

        WebView wv36 = (WebView) rootView.findViewById(R.id.webView36);

        WebSettings ws36 = wv36.getSettings();
        ws36.setJavaScriptEnabled(true);
        ws36.setSupportZoom(false);

        wv36.loadUrl("http://resr92.esy.es/goljogo16-cam.html");

        return rootView;
    }

}
