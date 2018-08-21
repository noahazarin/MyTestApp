package com.example.noah.mytestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.apptimize.Apptimize;
import com.apptimize.ApptimizeVar;

public class MainActivity extends AppCompatActivity {
    private static ApptimizeVar<Integer> repeatCount = ApptimizeVar.createInteger("repeatCount", 2);
    //private static ApptimizeVar<Integer> repeatCountBravo = ApptimizeVar.createInteger("repeatCountBravo", 2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Apptimize.setup(this, "CNaNXXJxgteuLRMgXDXwWTJsgkmffh8");
        Integer repeatCountInteger = repeatCount.value();
        TextView textView = (TextView) findViewById(R.id.myText);
        textView.setText(String.format("the variable being passed is %d", repeatCountInteger));
    }
}
