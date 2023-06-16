package com.bt.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BT6 extends AppCompatActivity {
    Spinner spn;
    EditText edtma;
    EditText edtten;
    Button btnnhap;
    TextView tvkq;
    ArrayList<String> data=new ArrayList<>();
    ArrayList<String>arrayListSS = new ArrayList<>();
    ArrayList<String>arrayListIP = new ArrayList<>();
    ArrayList<String>arrayListIPad = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bt6);
        addControl();
        initdata();
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,data);
        spn.setAdapter(adapter);
        addEvent();

    }
    private void addControl(){
        spn = findViewById(R.id.spnsp);
        edtma = findViewById(R.id.edtma);
        edtten = findViewById(R.id.edtten);
        btnnhap = findViewById(R.id.btnnhap);
        tvkq = findViewById(R.id.tvkq);

    }
    private void initdata(){
        data.add("1 - SamSung");
        data.add("2 - Iphone");
        data.add("3 - IPad");
    }
    private void addEvent(){
        StringBuilder sbss = new StringBuilder();
        StringBuilder sbiph = new StringBuilder();
        StringBuilder sbip = new StringBuilder();
        btnnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dm = spn.getSelectedItem().toString();
                String ma = edtma.getText().toString();
                String ten = edtten.getText().toString();

                String result = ma + " - " + ten;

                if (dm.equals("1 - SamSung")) {
                    if (!arrayListSS.contains(result)) {
                        arrayListSS.add(result);
                        sbss.append(result).append("\n");

                    } else {
                        Toast.makeText(BT6.this, "Item already exists", Toast.LENGTH_SHORT).show();
                    }
                    tvkq.setText(sbss.toString());
                } else if (dm=="2 - Iphone") {
                    if (!arrayListIP.contains(result)) {
                        arrayListIP.add(result);
                        sbiph.append(result).append("\n");

                    } else {
                        Toast.makeText(BT6.this, "Item already exists", Toast.LENGTH_SHORT).show();
                    }
                    tvkq.setText(sbiph.toString());
                }
                else {
                    if (!arrayListIPad.contains(result)) {
                        arrayListIPad.add(result);
                        sbip.append(result).append("\n");

                    } else {
                        Toast.makeText(BT6.this, "Item already exists", Toast.LENGTH_SHORT).show();
                    }
                    tvkq.setText(sbip.toString());
                }
            }
        });
        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                if (item != null) {
                    if(item =="1 - SamSung"){
                        tvkq.setText(sbss);
                    } else if (item =="2 - Iphone") {
                        tvkq.setText(sbiph);

                    }
                    else {
                        tvkq.setText(sbip);
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}