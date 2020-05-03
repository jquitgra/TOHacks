package com.example.tohacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.JavaCameraView;
import org.opencv.core.Mat;

public class MainActivity extends AppCompatActivity {


    /**
     * @param view
     * Start using the app, first turn to the setting page
     */
    public void StartUsing(View view){
        Intent start = new Intent(this, SettingActivity.class);
        startActivity(start);
    }

}
