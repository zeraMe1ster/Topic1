package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GridLayoutActivity extends AppCompatActivity {

    Button btnSendNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        btnSendNext = findViewById(R.id.btnSendNext);

        btnSendNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GridLayoutActivity.this,Calculate.class);
                startActivity(intent);
            }
        });
    }
}
