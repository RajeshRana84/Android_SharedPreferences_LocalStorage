package com.example.rajeshrana.sharedpreferences_localstorage;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    Button btnSave;
    Button btnLoad;
    SharedPreferencesDemo sharedPreferencesDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferencesDemo = new SharedPreferencesDemo(this);
    }


    public void onSaveClick(View view) {
        firstName = (EditText)findViewById(R.id.etFirstName);
        lastName = (EditText)findViewById(R.id.etLastName);

        SharedPreferencesDemo sharedPreferencesDemo = new SharedPreferencesDemo(this);
        sharedPreferencesDemo.saveData(firstName.getText().toString() , lastName.getText().toString());

    }

    public void onLoadClick(View view) {
        String content = sharedPreferencesDemo.loadData();

        Toast.makeText(getApplicationContext(), content ,Toast.LENGTH_LONG).show();

    }
}
