package com.example.geekbrains_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonForSquare);
        CheckBox checkBox = findViewById(R.id.checkBoxForResult);
        ToggleButton toggleButton = findViewById(R.id.toggleButtonForResult);
        Switch swch = findViewById(R.id.switchForResult);

        final EditText editText1 = findViewById(R.id.inputNumber);
        final TextView textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arg1 = Integer.valueOf(editText1.getText().toString());
                result = arg1*arg1;
                if(checkBox.isChecked() && toggleButton.isChecked() && swch.isChecked())
                    textView.setText(result.toString());
                else {
                    textView.setText("Check all elements");
                }
            }
        });


    }


    public void Click(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
}