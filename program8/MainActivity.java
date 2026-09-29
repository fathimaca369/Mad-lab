package com.example.listview1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    String fruitlist[] = {"dragon", "mango", "apple", "strawberry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(
                        this,
                        R.layout.activity_main2,
                        R.id.text,
                        fruitlist
                );

        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("Listview", "item is clicked @position" + i);

                if (i == 0) {
                    startActivity(new Intent(MainActivity.this, dragon.class));

                } else if (i == 1) {
                    startActivity(new Intent(MainActivity.this, mango.class));

                } else if (i == 2) {
                    startActivity(new Intent(MainActivity.this, apple.class));

                } else if (i == 3) {
                    startActivity(new Intent(MainActivity.this, strawberry.class));
                }
            }
        });
    }
}
