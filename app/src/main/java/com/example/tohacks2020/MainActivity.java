package com.example.tohacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param view
     * Start using the app, first turn to the setting page
     */
    public void StartUsing(View view){
        Intent start = new Intent(this, SettingActivity.class);
        startActivity(start);
    }

}
