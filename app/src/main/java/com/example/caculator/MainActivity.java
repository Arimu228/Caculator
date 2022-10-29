package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
    }

    public void onClearCLick(View view) {
        switch (view.getId()){
            case R.id.btn_clear: textView.setText("0");
                break;
            case R.id.btn_tochka:
//                if (textView.getText().toString().equals("0")){
//                    textView.setText(".");
//                }else
//                    textView.append(".");
//                break;
                if (dotIsPresent(textView.getText().toString())){}
                else{
                    textView.append(".");
                }
                break;
            case R.id.btn_1:
                if (textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else
                    textView.append("1");
                break;
            case R.id.btn_2:
                if (textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else
                    textView.append("2");
                break;
            case R.id.btn_3:
                if (textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else
                    textView.append("3");
                break;
            case R.id.btn_4:
                if (textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else
                    textView.append("4");
                break;
            case R.id.btn_5:
                if (textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else
                    textView.append("5");
                break;
            case R.id.btn_6:
                if (textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else
                    textView.append("6");
                break;
            case R.id.btn_7:
                if (textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else
                    textView.append("7");
                break;
            case R.id.btn_8:
                if (textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else
                    textView.append("8");
                break;
            case R.id.btn_9:
                if (textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else
                    textView.append("9");
                break;
            case R.id.btn_0:
                if (textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else
                    textView.append("0");
                break;
            case R.id.btn_backspace:
                String str = textView.getText().toString();
                if (str.isEmpty() == false){
                    textView.setText(str.substring(0, str.length() - 1));
                } else{
                    textView.setText("0");
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
        switch (view.getId()){
            case R.id.btn_minus:
                znak = "minus";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                break;
            case R.id.btn_plus:
                znak = "plus";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                break;
            case R.id.btn_multiply:
                znak = "multiply";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
                break;
            case R.id.btn_divide:
                znak = "divide";
                firstPeremennaya = Integer.parseInt(textView.getText().toString());
                textView.setText("0");
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
                break;
        }
    }
}