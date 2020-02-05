package com.example.pupfinds.ui.pages;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.pupfinds.R;


public class TranspoActivity extends Activity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transpo);

        WebView pageView = (WebView) findViewById(R.id.transpoweb);
        WebSettings pageSettings = pageView.getSettings();
        pageSettings.setJavaScriptEnabled(true);
        pageSettings.setSupportZoom(false);
        pageSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        pageSettings.setCacheMode(WebSettings.LOAD_CACHE_ONLY);
        pageSettings.setAppCacheEnabled(true);
        pageSettings.setDomStorageEnabled(true);
        pageSettings.setUseWideViewPort(true);


        pageView.setWebViewClient(new WebViewClient());
        pageView.loadUrl("file:///android_asset/WebPages/Food/Transportation.html");

    }


}
