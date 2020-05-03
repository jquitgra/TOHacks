package com.example.tohacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SettingActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tohacks2020.SettingActivity.MESSAGE";
    public static String Default = "14";
    Spinner spinner;
    private final String[] view= {"camera", "graph"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        setSpinner();
    }

    public void ShowInstruction(View view){
        TextView instruction = findViewById(R.id.instruction);
        instruction.setText(R.string.Setting_Instruction);
    }

    public void StartMonitor(View view){
        EditText editText = findViewById(R.id.avgFrequency);
        String answer = editText.getText().toString();
        Default = answer;
        String viewchoice = spinner.getSelectedItem().toString();
        if(viewchoice.equals("camera")) {
            Intent intent = new Intent(this, MonitorAcctivity.class);
            intent.putExtra(EXTRA_MESSAGE, answer);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, GraphActivity.class);
            intent.putExtra(EXTRA_MESSAGE, answer);
            startActivity(intent);
        }
        finish();
    }

    public void SkipMonitor(View view){
        String viewchoice = spinner.getSelectedItem().toString();
        if(viewchoice.equals("camera")) {
            Intent intent = new Intent(this, MonitorAcctivity.class);
            intent.putExtra(EXTRA_MESSAGE, Default);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent(this, GraphActivity.class);
            intent.putExtra(EXTRA_MESSAGE, Default);
            startActivity(intent);
        }
        finish();
    }

    /**
     * Set up the spinner
     **/
    public void setSpinner() {
        spinner = findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, view);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}

