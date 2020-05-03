package com.example.tohacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }

    public void ShowInstruction(View view){
        TextView instruction = findViewById(R.id.instruction);
        instruction.setText(R.string.Setting_Instruction);
    }





}
