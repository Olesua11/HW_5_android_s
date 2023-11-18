package com.example.hw_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.eadi_text);
        TextView textView = findViewById(R.id.text_view);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // обработка клика
                String text = editText.getText().toString();
                if (text.isEmpty()){
                    textView.setText("Текст пустой");
                }else {
                    textView.setText(text);
                }
            }
        });
    }
}