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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveLunchPage(View view){
        Intent intent = new Intent(getApplicationContext(), LunchPage.class);
        startActivity(intent);
    }

    public void moveECampusPage(View view){
        Intent intent = new Intent(getApplicationContext(), ECampusPage.class);
        startActivity(intent);
    }

    public void moveCalendarPage(View view){
        Intent intent = new Intent(getApplicationContext(), CalendarPage.class);
        startActivity(intent);
    }

    public void moveAnnouncePage(View view){
        Intent intent = new Intent(getApplicationContext(), AnnouncePage.class);
        startActivity(intent);
    }
}