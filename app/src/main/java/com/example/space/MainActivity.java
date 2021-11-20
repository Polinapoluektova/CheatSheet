package com.example.space;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView countriesList = findViewById(R.id.countriesList);
        String[] elements = getResources().getStringArray(R.array.elements);
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, elements);
        countriesList.setAdapter(adapter);
        countriesList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                String selectedItem = elements[position];
                Intent intentInfo = new Intent(MainActivity.this, SecondActivity.class);
                intentInfo.putExtra("choice", selectedItem);
                startActivity(intentInfo);
                }
            }
        );
    }
}
