


        package com.example.grid;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.grid.ImageAdapter;
import com.example.grid.R;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images = {
            R.drawable.m1,
            R.drawable.m2,
            R.drawable.m3,
            R.drawable.m4,
            R.drawable.m5,
            R.drawable.x6
    };

    String[] names = {
            "m1",
            "m2",
            "m3",
            "m4",
            "m5",
            "x6"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridview);

        ImageAdapter adapter = new ImageAdapter(this, images);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                showAlertDialog(position);
            }
        });
    }

    private void showAlertDialog(int position) {

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(images[position]);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(names[position]);
        builder.setMessage("You selected " + names[position]);
        builder.setIcon(images[position]);

        builder.setPositiveButton("OK", null);

        builder.setView(imageView);

        builder.show();
    }
}


