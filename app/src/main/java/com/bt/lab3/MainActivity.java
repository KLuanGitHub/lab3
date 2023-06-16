package com.bt.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addEvent();
    }

    private void addEvent() {
        btn1 = findViewById(R.id.main_btn1);
        btn2 = findViewById(R.id.main_btn2);
        btn3 = findViewById(R.id.main_btn3);
        btn4 = findViewById(R.id.main_btn4);
        btn5 = findViewById(R.id.main_btn5);
        btn6 = findViewById(R.id.main_btn6);
        btn7 = findViewById(R.id.main_btn7);
        btn8 = findViewById(R.id.main_btn8);
        btn9 = findViewById(R.id.main_btn9);
        btn10 = findViewById(R.id.main_btn10);
        btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai1.class)));
        btn2.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, activity_bai2.class)));
        btn3.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai3_8.class)));
        btn4.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai4.class)));
        btn5.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai5.class)));
        btn9.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai9.class)));
        btn8.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai3_8.class)));
        btn6.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, BT6.class)));
        btn7.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, BT7.class)));
        btn10.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, bai10.class)));

    }
}