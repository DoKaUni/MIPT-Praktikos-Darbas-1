package com.example.miptpraktikosdarbas1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        TextView Text2 = findViewById(R.id.textView2);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Text2.setText("Text Successfully Set");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Text2.setTextColor(Color.parseColor("#0000FF"));
            }
        });
    }
}