package ru.vavtech.septemberworkout.activities;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import ru.vavtech.septemberworkout.R;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    Button changeTextDirectionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.hello_world_text_view);
        button = findViewById(R.id.change_color_button);
        changeTextDirectionButton = findViewById(R.id.change_text_direction);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if (textView.getCurrentTextColor() == getResources().getColor(R.color.colorRed)) {
                    textView.setTextColor(getResources().getColor(R.color.colorBlue));
                } else {
                    textView.setTextColor(getResources().getColor(R.color.colorRed));
            }*/
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                textView.setTextColor(color);

            }
        });


        changeTextDirectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(new StringBuilder(textView.getText().toString()).reverse().toString());
            }
        });

    }
}
