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
public class chongdayvideo_Activity extends AppCompatActivity {
    public void bn_backlsp1pushup(View view){
        Intent intent = new Intent(this,lesson_part1Activity.class);
        this.startActivity(intent);

    }
    public void bn_chongdaydetails(View view){
        Intent intent = new Intent(this, chongdaydetails_Activity.class);
        this.startActivity(intent);
    }
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chongdayvideo_layout);
        webView = findViewById(R.id.lenghevideo);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.youtube.com/watch?v=2J2g7XOr2i4&ab_channel=HollyDolke");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}