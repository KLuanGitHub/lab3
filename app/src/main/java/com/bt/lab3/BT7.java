package com.bt.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BT7 extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt7);
        addControl();
        addEvent();
    }
    private void addControl(){
        btn1 = findViewById(R.id.btndang1);
        btn2 = findViewById(R.id.btndang2);
        btn3 = findViewById(R.id.btndang3);
    }
    private void addEvent(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BT7.this,BT7a.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BT7.this,BT7b.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BT7.this,BT7c.class);
                startActivity(intent);
            }
        });
    }
}
