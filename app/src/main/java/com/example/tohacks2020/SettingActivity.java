package com.example.tohacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tohacks2020.SettingActivity.MESSAGE";
    public static String Default = "14";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void ShowInstruction(View view){
        TextView instruction = findViewById(R.id.instruction);
        instruction.setText(R.string.Setting_Instruction);
    }

    public void StartMonitor(View view){
        EditText editText = findViewById(R.id.avgFrequency);
        String answer = editText.getText().toString();
        Default = answer;
        Intent intent = new Intent(this, MonitorAcctivity.class);
        intent.putExtra(EXTRA_MESSAGE, answer);
        startActivity(intent);
        finish();
    }

    public void SkipMonitor(View view){
        Intent intent = new Intent(this, MonitorAcctivity.class);
        intent.putExtra(EXTRA_MESSAGE, Default);
        startActivity(intent);
        finish();
    }




}
