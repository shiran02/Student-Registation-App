package com.cadenza.studentregistationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private EditText editText;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

        textView.setText("Student Information");




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                //Log.i("INFO","clicked");
//                textView.setText("Student Information" + i);
//                i++;

                String val = editText.getText().toString();
                textView.setText("Hello  :" + val);

            }
        });
    }
}