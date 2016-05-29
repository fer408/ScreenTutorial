package com.example.android.screentutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        Button btn3 = (Button)findViewById(R.id.button_go_to_screen_4);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c_second_activity = new Intent(ThirdActivity.this,FourthActivity.class);
                startActivity(c_second_activity);
            }
        });

        Button btn5 = (Button)findViewById(R.id.button_back_to_screen_2);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e_second_activity = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(e_second_activity);
            }
        });

    }
}
