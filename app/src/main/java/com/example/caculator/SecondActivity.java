package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        result = findViewById(R.id.new_activity_result);

        Intent intent = getIntent();
        String str = intent.getStringExtra("the result is");
        result.setText(str);
    }
    public void onLogicCLick(View view){
        switch (view.getId()){
            case R.id.destroy_btn:
                finish();
        }
    }
}