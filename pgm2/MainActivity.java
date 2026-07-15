package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate invoked ");
    }
    protected void onStart()
    {
        super.onStart();
        Log.d("lifecycle", "onStart invoked ");

    }
    protected void onResume()
    {
        super.onResume();
        Log.d("lifecycle", "onResume invoked ");

    }
    protected void onPause()
    {
        super.onPause();
        Log.d("lifecycle", "onPause invoked ");
    }
    protected void onRestart()
    {
        super.onRestart();
        Log.d("lifecyle", "onRestart invoked ");

    }
    protected void onDistroy()
    {
        super.onDestroy();
        Log.d("lifecycle", "onDistroy invoked ");
    }
}