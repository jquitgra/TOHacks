package com.example.tohacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MonitorAcctivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        Intent answer = getIntent();
        int frequency = Integer.parseInt(answer.getStringExtra(SettingActivity.EXTRA_MESSAGE));
        int threshold = frequency*3;
    }
}
