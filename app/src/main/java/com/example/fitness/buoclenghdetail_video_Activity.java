package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class buoclenghdetail_video_Activity extends AppCompatActivity {
    WebView webView;
    public void bn_back_buoclenghe(View view){
        Intent intent = new Intent(this, lesson_part1Activity.class);
        this.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buoclenghdetail_video_layout);
        webView = findViewById(R.id.chongdayvideo);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/watch?v=sZzkUQWNTiw&ab_channel=SarahTran");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}