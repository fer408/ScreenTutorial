package com.example.android.screentutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn2 = (Button)findViewById(R.id.button_go_to_screen_3);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_second_activity = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(b_second_activity);
            }
        });

        Button btn4 = (Button)findViewById(R.id.button_back_to_screen_1);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d_second_activity = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(d_second_activity);
            }
        });

    }
}
