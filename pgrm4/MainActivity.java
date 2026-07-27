package com.example.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=findViewById(R.id.t1);
        EditText Name=findViewById(R.id.t2);
        EditText PhoneNumber=findViewById(R.id.t3);
        EditText Email=findViewById(R.id.t4);
        EditText Password=findViewById(R.id.t5);
        EditText ConfirmPassword=findViewById(R.id.t6);
        Button Submit=findViewById(R.id.btnSubmit);

        sharedPreferences = getSharedPreferences("UserDetailes",MODE_PRIVATE);
        editor = sharedPreferences.edit();
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Names = Name.getText().toString().trim();
                String PhoneNumbers = PhoneNumber.getText().toString().trim();
                String Emails = Email.getText().toString().trim();
                String Passwords = Password.getText().toString().trim();
                String ConfirmPasswords = ConfirmPassword.getText().toString().trim();


                if (Names.isEmpty()) {
                    Name.setError("Name is Empty");
                    Name.requestFocus();
                    return;
                }

                if (PhoneNumbers.isEmpty()) {
                    PhoneNumber.setError("mobilenumber is Empty");
                    PhoneNumber.requestFocus();
                    return;
                }

                if (Emails.isEmpty()) {
                    Email.setError("Input Email");
                    Email.requestFocus();
                    return;
                }

                if (Passwords.length() < 6) {
                    Password.setError("Length must be minimum 6 characters");
                    Password.requestFocus();
                    return;
                }

                if (!Passwords.equals(ConfirmPasswords)) {
                    ConfirmPassword.setError("Password not matched");
                    ConfirmPassword.requestFocus();
                    return;
                }

                Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                editor.putString("keyName", Names);
                editor.putString("keyPhoneNumber", PhoneNumbers);
                editor.putString("keyEmail", Emails);
                editor.putString("keyPassword", ConfirmPasswords);
                editor.apply();
            }});


    }

}
