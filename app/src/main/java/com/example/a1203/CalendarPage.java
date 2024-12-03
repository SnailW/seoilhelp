package com.example.a1203;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CalendarPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);

        WebView browser = (WebView) findViewById(R.id.webView3);
        browser.loadUrl("https://attend.seoil.ac.kr/forward/MN/MN/PU_MNMN01_E01.do?r=https%3A%2F%2Fattend.seoil.ac.kr%2Fforward%2FMN%2FMN%2FCM_MNMN01_V01.do%3Fnull");
    }
    public void moveHomePage(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}