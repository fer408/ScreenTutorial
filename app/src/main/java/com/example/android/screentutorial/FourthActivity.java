package com.example.android.screentutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button btn6 = (Button)findViewById(R.id.button_back_to_screen_3);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f_second_activity = new Intent(FourthActivity.this,ThirdActivity.class);
                startActivity(f_second_activity);
            }
        });


    }
}
