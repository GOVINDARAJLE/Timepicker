package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TextView  textView1;
    TimePicker timepicker;
    Button changetime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            textView1=(TextView)findViewById(R.id.textView1);
            changetime=(Button)findViewById(R.id.button1);
            timepicker.setIs24HourView(true);
            timepicker=(TimePicker)findViewById(R.id.timepicker);
    changetime.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView1.setText(getCurrentTime());
        }
    });

    }

    private String getCurrentTime() {
        String currentTime="Current Time:"+timepicker.getCurrentHour()+":"+timepicker.getCurrentMinute();
        return currentTime;
    }
}
