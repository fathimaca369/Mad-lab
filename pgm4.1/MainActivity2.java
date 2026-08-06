package com.example.sharedpreferences;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);

        String name = getIntent().getStringExtra("Name");
        String phone = getIntent().getStringExtra("PhoneNumber");
        String email = getIntent().getStringExtra("Email");
        String password = getIntent().getStringExtra("Password");

        text1.setText("Name : " + name);
        text2.setText("Phone Number : " + phone);
        text3.setText("Email : " + email);
        text4.setText("Password : " + password);
    }
}