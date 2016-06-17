package com.example.oprel_mac.trial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class PersonalityTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personality_test);

        WebView webView = (WebView) findViewById(R.id.webViewForPersonalityTest);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/forms/d/1lhE98-Zyvgta0V350b31xLGc6W9yyEqioh0s86WmM-M/viewform");

    }
}
