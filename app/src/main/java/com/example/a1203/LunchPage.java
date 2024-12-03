package com.example.a1203;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class LunchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_page);

        WebView browser = (WebView) findViewById(R.id.webView2);
        browser.loadUrl("https://www.seoil.ac.kr/seoil/598/subview.do?enc=Zm5jdDF8QEB8JTJGYmJzJTJGc2VvaWwlMkY3MiUyRmFydGNsTGlzdC5kbyUzRmJic0NsU2VxJTNEJTI2YmJzT3BlbldyZFNlcSUzRCUyNmlzVmlld01pbmUlM0RmYWxzZSUyNnNyY2hDb2x1bW4lM0RzaiUyNnNyY2hXcmQlM0QlRUQlOTUlOTklRUMlODMlOUQlRUMlOEIlOUQlRUIlOEIlQjklMjY%3D");
    }
    public void moveHomePage(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}