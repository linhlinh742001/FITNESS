package com.example.fitness;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class jumpingvideo_Activity extends AppCompatActivity {
    public void bn_back_hoat_hinh(View view){
        Intent intent = new Intent(this, jumpingdetail_Activity.class);
        this.startActivity(intent);
    }
    public void bn_backlsp1_jump(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jumpingvideo_layout);
        webView = findViewById(R.id.webviewvideo);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/watch?v=2J2g7XOr2i4&ab_channel=HollyDolke");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
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

