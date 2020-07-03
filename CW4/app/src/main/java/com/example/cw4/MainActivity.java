package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText one = findViewById(R.id.one);
        final EditText two = findViewById(R.id.two);
        Button three = findViewById(R.id.button);
        Button four = findViewById(R.id.button2);

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = one.getText().toString();
                String s = two.getText().toString();
                int d = Integer.parseInt(a);
                int f = Integer.parseInt(s);

                int ayah = d+f;
                Toast.makeText(MainActivity.this,"Its:"+ayah,Toast.LENGTH_LONG).show();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = one.getText().toString();
                String s = two.getText().toString();
                int d = Integer.parseInt(a);
                int f = Integer.parseInt(s);

                int ayah = d-f;
                Toast.makeText(MainActivity.this,"Its:"+ayah,Toast.LENGTH_LONG).show();
            }
        });

    }
}