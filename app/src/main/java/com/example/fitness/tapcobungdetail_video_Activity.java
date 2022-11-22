package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class tapcobungdetail_video_Activity extends AppCompatActivity {
    public void bn_back_tapcobungdetail(View view){
        Intent intent = new Intent(this, tapcobungdetail_Activity.class);
        this.startActivity(intent);
    }
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tapcobungdetail_video_layout);
        webView = findViewById(R.id.tapcobungvideo);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/watch?v=2pLT-olgUJs&t=405s&ab_channel=ChloeTing");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}