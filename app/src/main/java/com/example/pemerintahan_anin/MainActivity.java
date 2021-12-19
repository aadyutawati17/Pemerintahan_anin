package com.example.pemerintahan_anin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listView);
        adapter = ArrayAdapter.createFromResource(this, R.array.Pemerintahan_anin, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
    }
}