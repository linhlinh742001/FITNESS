package com.example.fitness;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class jumpingvideo_Activity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jumpingvideo_layout);
        webView = findViewById(R.id.webviewvideo);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/watch?v=W4eKVKwf3rQ&ab_channel=emiwong");
       // WebSettings webSettings = webView.getSettings();
     //   webSettings.setJavaScriptEnabled(true);
    }

//    private class MywebClient extends WebViewClient{
//        @Override
//        public void onPageStarted(WebView view, String url, Bitmap favicon) {
//            super.onPageStarted(view, url, favicon);
//        }
//        @Override
//        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//            return super.shouldOverrideUrlLoading(view, request);
//        }
//    }
//    @Override
//    public void onBackPressed() {
//        if(webView.isFocused() && webView.canGoBack())
//        {
//            webView.goBack();
//        }else{
//            super.onBackPressed();
//        }
    }

