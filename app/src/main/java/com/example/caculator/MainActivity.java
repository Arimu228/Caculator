package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Integer firstPeremennaya;
    private Integer secondPeremennaya;
    private String znak;
    private Integer result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button resultButton = findViewById(R.id.new_activity_btn);
        resultButton.setVisibility(View.GONE);

        newIntent();
    }

    public void onClearCLick(View view) {
        Button resultButton = findViewById(R.id.new_activity_btn);
        switch (view.getId()){
            case R.id.btn_clear: textView.setText("0");resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_tochka:
                if (dotIsPresent(textView.getText().toString())){}
                else{
                    textView.append(".");
                } resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_1:
                if (textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else
                    textView.append("1"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_2:
                if (textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else
                    textView.append("2"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_3:
                if (textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else
                    textView.append("3"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_4:
                if (textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else
                    textView.append("4"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_5:
                if (textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else
                    textView.append("5"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_6:
                if (textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else
                    textView.append("6"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_7:
                if (textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else
                    textView.append("7"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_8:
                if (textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else
                    textView.append("8"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_9:
                if (textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else
                    textView.append("9"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_0:
                if (textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else
                    textView.append("0"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_backspace:
                String str = textView.getText().toString();
                if (str.isEmpty() == false){
                    textView.setText(str.substring(0, str.length() - 1));
                } else{
                    textView.setText("0"); resultButton.setVisibility(View.GONE);
                }
        }
    }
    public boolean dotIsPresent(String num){
        if (num.indexOf(".") == -1){
            return false;
        } else{
            return true;
        }
    }


    public void onLogicCLick(View view) {
        Button resultButton = findViewById(R.id.new_activity_btn);
        switch (view.getId()){
            case R.id.btn_minus:
                znak = "minus";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");  resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_plus:
                znak = "plus";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_multiply:
                znak = "multiply";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_divide:
                znak = "divide";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0"); resultButton.setVisibility(View.GONE);
                break;
            case R.id.btn_equal:
                secondPeremennaya = Integer.parseInt(textView.getText().toString());
                if (znak.equals("minus")){
                    result = firstPeremennaya - secondPeremennaya;
                } else if (znak.equals("plus")) {
                    result = firstPeremennaya + secondPeremennaya;
                } else if (znak.equals("multiply")) {
                    result = firstPeremennaya * secondPeremennaya;
                } else if (znak.equals("divide")) {
                    result = firstPeremennaya / secondPeremennaya;
                }
                textView.setText(result.toString());
                resultButton.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void newIntent(){
        Button resultButton = findViewById(R.id.new_activity_btn);
        resultButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("the result is", textView.getText().toString());
            startActivity(intent);
        });
    }
}