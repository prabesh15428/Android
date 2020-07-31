package com.example.myconta;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CheckInfo extends AppCompatActivity {

    TextView t1, t2, t3, t4;
    Button b1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        t1 = findViewById(R.id.key);
        t4 = findViewById(R.id.name);
        t2 = findViewById(R.id.number);
        t3 = findViewById(R.id.address);
        b1 = findViewById(R.id.call);

    }
}