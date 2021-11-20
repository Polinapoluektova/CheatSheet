package com.example.space;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        TextView textView = findViewById(R.id.elementsList);
        WebView browser = (WebView) findViewById(R.id.webBrowser);
        String elementsList = getIntent().getStringExtra("choice");
        switch (elementsList) {
            case ("Происхождение Вселенной"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://new-science.ru/proishozhdenie-vselennoj-7-razlichnyh-teorij/");
                break;
            case ("Планеты"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://pikabu.ru/story/planetyi_6295941");
                break;
            case ("Звёзды"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://v-kosmose.com/zvezdyi-vselennoi/");
                break;
            case ("Галактика"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Галактика");
                break;
            case ("Чёрная дыра"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Чёрная_дыра");
                break;
            case ("Тёмная материя"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Тёмная_материя");
                break;
            case ("Освоение космоса"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Освоение_космоса");
                break;
            case ("Hubble"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Хаббл_(телескоп)");
                break;
            case ("Теория мультивселенной"):
                textView.setText(elementsList);
                browser.setWebViewClient(new WebViewClient());
                browser.loadUrl("https://ru.wikipedia.org/wiki/Мультивселенная");
                break;
        }
    }
}